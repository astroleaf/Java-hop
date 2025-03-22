import java.util.HashMap;
import java.util.Scanner;

public class ECommerceWebsite {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("Laptop", 999.99);
        products.put("Smartphone", 499.99);
        products.put("Headphones", 199.99);
        products.put("Smartwatch", 299.99);
        products.put("Tablet", 399.99);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the E-commerce Website!");
        System.out.println("Available products: " + products.keySet());

        while (true) {
            System.out.print("Enter the product name to buy (or type 'exit' to quit): ");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting! Goodbye!");
                break;
            }

            if (products.containsKey(productName)) {
                System.out.println("You have purchased: " + productName + " for $" + products.get(productName));
            } else {
                System.out.println("Product not found. Please check the name and try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
}