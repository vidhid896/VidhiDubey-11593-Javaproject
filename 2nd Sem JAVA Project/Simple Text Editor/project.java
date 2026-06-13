import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Document doc = new Document();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Document Editor Console ===");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Text");
            System.out.println("2. Reverse Text");
            System.out.println("3. Clear Text");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text to add: ");
                    String textToAdd = scanner.nextLine();
                    doc.addText(textToAdd);
                    System.out.println("Text added successfully!");
                    break;

                case 2:
                    doc.reverseText();
                    System.out.println("Text reversed!");
                    doc.displayText();
                    break;

                case 3:
                    doc.clearText();
                    System.out.println("Text cleared!");
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 6.");
            }
        }
        scanner.close();
    }
}
