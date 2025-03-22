import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApplication {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the To-Do List Application!");
        System.out.println("You can add, view, and remove tasks.");
        System.out.println("Type 'exit' to quit the application.");

        while (true) {
            System.out.print("Enter a command (add/view/remove): ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Enter the task to add: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added: " + task);
            } else if (command.equalsIgnoreCase("view")) {
                System.out.println("Your tasks:");
                for (String task : tasks) {
                    System.out.println("- " + task);
                }
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.print("Enter the task to remove: ");
                String taskToRemove = scanner.nextLine();
                if (tasks.remove(taskToRemove)) {
                    System.out.println("Task removed: " + taskToRemove);
                } else {
                    System.out.println("Task not found.");
                }
            } else {
                System.out.println("Invalid command. Please try again.");
            }
            System.out.println();
        }
        System.out.println("Thank you for using the To-Do List Application!");
        scanner.close();
    }
}