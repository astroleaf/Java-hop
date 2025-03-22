import java.util.ArrayList;
import java.util.Scanner;

public class PersonalFinanceTracker {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Personal Finance Tracker!");
        System.out.println("You can add, view, and calculate total expenses.");
        System.out.println("Type 'exit' to quit the application.");

        while (true) {
            System.out.print("Enter a command (add/view/total): ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the Personal Finance Tracker. Goodbye!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Enter the expense amount: ");
                try {
                    double expense = Double.parseDouble(scanner.nextLine());
                    expenses.add(expense);
                    System.out.println("Expense added: $" + expense);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            } else if (command.equalsIgnoreCase("view")) {
                System.out.println("Your expenses:");
                for (Double expense : expenses) {
                    System.out.println("- $" + expense);
                }
            } else if (command.equalsIgnoreCase("total")) {
                double total = 0;
                for (Double expense : expenses) {
                    total += expense;
                }
                System.out.println("Total expenses: $" + total);
            } else {
                System