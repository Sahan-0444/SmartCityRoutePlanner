class AVLNode {
    String location;
    AVLNode left, right;
    int height;

    AVLNode(String location) {
        this.location = location;
        this.height = 1;
    }
}

public class AVLTree {
    private AVLNode root;

    // Get height of node
    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor
    private int getBalance(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a location
    public void insert(String location) {
        root = insertRec(root, location);
    }

    private AVLNode insertRec(AVLNode node, String location) {
        if (node == null) {
            return new AVLNode(location);
        }

        if (location.compareTo(node.location) < 0) {
            node.left = insertRec(node.left, location);
        } else if (location.compareTo(node.location) > 0) {
            node.right = insertRec(node.right, location);
        } else {
            return node; // Duplicate locations not allowed
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && location.compareTo(node.left.location) < 0) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && location.compareTo(node.right.location) > 0) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && location.compareTo(node.left.location) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && location.compareTo(node.right.location) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Delete a location
    public void delete(String location) {
        root = deleteRec(root, location);
    }

    private AVLNode deleteRec(AVLNode root, String location) {
        if (root == null) {
            return root;
        }

        if (location.compareTo(root.location) < 0) {
            root.left = deleteRec(root.left, location);
        } else if (location.compareTo(root.location) > 0) {
            root.right = deleteRec(root.right, location);
        } else {
            if ((root.left == null) || (root.right == null)) {
                AVLNode temp = null;
                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }

                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                AVLNode temp = minValueNode(root.right);
                root.location = temp.location;
                root.right = deleteRec(root.right, temp.location);
            }
        }

        if (root == null) {
            return root;
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // In-order traversal to display locations
    public void displayLocations() {
        System.out.println("All Locations (in AVL Tree order):");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(AVLNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.location + " ");
            inOrder(node.right);
        }
    }

    // Check if location exists
    public boolean contains(String location) {
        return containsRec(root, location);
    }

    private boolean containsRec(AVLNode node, String location) {
        if (node == null) {
            return false;
        }
        if (location.equals(node.location)) {
            return true;
        }
        return location.compareTo(node.location) < 0 ? containsRec(node.left, location) : containsRec(node.right, location);
    }
}
