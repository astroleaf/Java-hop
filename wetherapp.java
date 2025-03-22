import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Weather App!");
        System.out.println("This app converts Celsius to Fahrenheit.");

        while (true) {
            System.out.print("Enter the temperature in Celsius (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the Weather App. Goodbye!");
                break;
            }

            try {
                double celsius = Double.parseDouble(input);
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
            System.out.println();
        }
        scanner.close();
    }
}