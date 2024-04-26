package view;

public class ConsolePrinter {
    public static void print(StringBuilder message) {
        // Clear the console
        clearScreen();

        // Print the message
        System.out.println(message);
    }

    public static void print(String message) {
        // Clear the console
        clearScreen();

        // Print the message
        System.out.println(message);
    }

    private static void clearScreen() {
        // Clear the console
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}