import java.util.Scanner;

public class ChatApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Chat Application!");
        System.out.println("Type your messages below. Type 'exit' to end the chat.");

        while (true) {
            System.out.print("You: ");
            String message = scanner.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Chat ended. Goodbye!");
                break;
            }

            System.out.println("Friend: " + message); // Echoing back for simplicity
            System.out.println();
        }
        scanner.close();
    }
}