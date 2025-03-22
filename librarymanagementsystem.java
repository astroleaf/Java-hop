import java.util.HashMap;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        HashMap<String, Boolean> books = ```java
        new HashMap<>();
        books.put("Java Programming", true);
        books.put("Data Structures", true);
        books.put("Algorithms", true);
        books.put("Design Patterns", true);
        books.put("Operating Systems", true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library Management System!");
        System.out.println("Available books: " + books.keySet());

        while (true) {
            System.out.print("Enter the book name to borrow (or type 'exit' to quit): ");
            String bookName = scanner.nextLine();

            if (bookName.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the Library Management System. Goodbye!");
                break;
            }

            if (books.containsKey(bookName)) {
                if (books.get(bookName)) {
                    books.put(bookName, false);
                    System.out.println("You have successfully borrowed: " + bookName);
                } else {
                    System.out.println("Sorry, this book is currently borrowed by someone else.");
                }
            } else {
                System.out.println("Book not found in the library.");
            }
            System.out.println();
        }
        scanner.close();
    }
}