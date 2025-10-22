import java.util.*;

public class Graph {
    private Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Add a location (vertex)
    public void addLocation(String location) {
        adjacencyList.putIfAbsent(location, new ArrayList<>());
    }

    // Remove a location (vertex)
    public void removeLocation(String location) {
        adjacencyList.remove(location);
        // Remove from all adjacency lists
        for (List<String> neighbors : adjacencyList.values()) {
            neighbors.remove(location);
        }
    }

    // Add a road (edge) between two locations
    public void addRoad(String from, String to) {
        adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from); // Undirected graph
    }

    // Remove a road (edge) between two locations
    public void removeRoad(String from, String to) {
        adjacencyList.get(from).remove(to);
        adjacencyList.get(to).remove(from);
    }

    // Get all locations
    public Set<String> getLocations() {
        return adjacencyList.keySet();
    }

    // Get connections for a location
    public List<String> getConnections(String location) {
        return adjacencyList.getOrDefault(location, new ArrayList<>());
    }

    // Display all connections
    public void displayConnections() {
        System.out.println("All Connections:");
        for (String location : adjacencyList.keySet()) {
            System.out.print(location + " -> ");
            List<String> connections = adjacencyList.get(location);
            if (connections.isEmpty()) {
                System.out.println("No connections");
            } else {
                for (int i = 0; i < connections.size(); i++) {
                    System.out.print(connections.get(i));
                    if (i < connections.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }

    // BFS traversal using Queue
    public void bfsTraversal(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        System.out.print("BFS Traversal from " + start + ": ");
        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");
            for (String neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS traversal using Stack
    public void dfsTraversal(String start) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);

        System.out.print("DFS Traversal from " + start + ": ");
        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                System.out.print(current + " ");
                for (String neighbor : adjacencyList.get(current)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        System.out.println();
    }
}
