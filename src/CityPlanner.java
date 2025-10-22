import java.util.Scanner;

public class CityPlanner {
    private Graph graph;
    private AVLTree locationTree;
    private Scanner scanner;

    public CityPlanner() {
        graph = new Graph();
        locationTree = new AVLTree();
        scanner = new Scanner(System.in);
    }

    // Add a new location
    public void addLocation() {
        System.out.print("Enter location name: ");
        String location = scanner.nextLine().trim();
        if (location.isEmpty()) {
            System.out.println("Location name cannot be empty.");
            return;
        }
        if (locationTree.contains(location)) {
            System.out.println("Location already exists.");
            return;
        }
        locationTree.insert(location);
        graph.addLocation(location);
        System.out.println("Location added successfully.");
    }

    // Remove a location
    public void removeLocation() {
        System.out.print("Enter location name to remove: ");
        String location = scanner.nextLine().trim();
        if (!locationTree.contains(location)) {
            System.out.println("Location does not exist.");
            return;
        }
        locationTree.delete(location);
        graph.removeLocation(location);
        System.out.println("Location removed successfully.");
    }

    // Add a road between locations
    public void addRoad() {
        System.out.print("Enter first location: ");
        String from = scanner.nextLine().trim();
        System.out.print("Enter second location: ");
        String to = scanner.nextLine().trim();

        if (!locationTree.contains(from) || !locationTree.contains(to)) {
            System.out.println("One or both locations do not exist.");
            return;
        }
        if (from.equals(to)) {
            System.out.println("Cannot add road to the same location.");
            return;
        }
        graph.addRoad(from, to);
        System.out.println("Road added successfully.");
    }

    // Remove a road between locations
    public void removeRoad() {
        System.out.print("Enter first location: ");
        String from = scanner.nextLine().trim();
        System.out.print("Enter second location: ");
        String to = scanner.nextLine().trim();

        if (!locationTree.contains(from) || !locationTree.contains(to)) {
            System.out.println("One or both locations do not exist.");
            return;
        }
        graph.removeRoad(from, to);
        System.out.println("Road removed successfully.");
    }

    // Display all connections
    public void displayConnections() {
        graph.displayConnections();
    }

    // Display all locations using AVL tree
    public void displayLocations() {
        locationTree.displayLocations();
    }

    // Demonstrate traversal (BFS or DFS)
    public void demonstrateTraversal() {
        System.out.print("Enter starting location for traversal: ");
        String start = scanner.nextLine().trim();
        if (!locationTree.contains(start)) {
            System.out.println("Location does not exist.");
            return;
        }
        System.out.println("Choose traversal type:");
        System.out.println("1. BFS (Breadth-First Search)");
        System.out.println("2. DFS (Depth-First Search)");
        System.out.print("Enter choice: ");
        int choice = getIntInput();
        switch (choice) {
            case 1:
                graph.bfsTraversal(start);
                break;
            case 2:
                graph.dfsTraversal(start);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Helper method to get integer input with validation
    private int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return input;
    }

    public void closeScanner() {
        scanner.close();
    }
}
