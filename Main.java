import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    // Step 1: Initialize an empty list to store tasks
    private static List<String> tasks = new ArrayList<>();

    // Step 2: Define a function to add a task
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Step 3: Define a function to run the scheduler
    public static void runScheduler() {
        System.out.println("Running Task Scheduler...");
        for (String task : tasks) {
            System.out.println("Executing task: " + task);
            // Simulate task execution (could add delay or logic here)
        }
    }

    // Step 4: Define the main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Run Scheduler");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case 2:
                    runScheduler();
                    break;
                case 3:
                    System.out.println("Exiting Task Scheduler.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
