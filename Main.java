import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceManager manager = new ServiceManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Real-Time Local Service Finder ===");
            System.out.println("1. View all services");
            System.out.println("2. Search services by category");
            System.out.println("3. Update service status (Open/Closed)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    List<Service> all = manager.getAllServices();
                    System.out.println("\nAll Services:");
                    all.forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Enter category to search (e.g. Pharmacy, Doctor): ");
                    String category = sc.nextLine();
                    List<Service> result = manager.searchByCategory(category);
                    System.out.println("\nSearch Results:");
                    if (result.isEmpty()) {
                        System.out.println("No services found in this category.");
                    } else {
                        result.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Enter exact service name to update: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new status (open/close): ");
                    String status = sc.nextLine().toLowerCase();

                    boolean isOpen = status.startsWith("open");

                    boolean updated = manager.updateStatus(name, isOpen);
                    if (updated) {
                        System.out.println("Status updated successfully.");
                    } else {
                        System.out.println("Service not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
