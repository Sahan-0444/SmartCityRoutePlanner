import java.util.Scanner;

public class Menu {
    private CityPlanner planner;
    private Scanner scanner;

    public Menu() {
        planner = new CityPlanner();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n--- Smart City Route Planner ---");
        System.out.println("1. Add a new location");
        System.out.println("2. Remove a location");
        System.out.println("3. Add a road between locations");
        System.out.println("4. Remove a road");
        System.out.println("5. Display all connections");
        System.out.println("6. Display all locations (using AVL tree)");
        System.out.println("7. Demonstrate traversal (BFS/DFS)");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    planner.addLocation();
                    break;
                case 2:
                    planner.removeLocation();
                    break;
                case 3:
                    planner.addRoad();
                    break;
                case 4:
                    planner.removeRoad();
                    break;
                case 5:
                    planner.displayConnections();
                    break;
                case 6:
                    planner.displayLocations();
                    break;
                case 7:
                    planner.demonstrateTraversal();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        planner.closeScanner();
        scanner.close();
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
}
