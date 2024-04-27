package view.interaction;

import java.util.Scanner;

public class Interaction {
    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        int input = scanner.nextInt();
        scanner.nextLine();

        return input;
    }

    public static String getString(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        String input = scanner.nextLine();

        return input;
    }

    public static char getChar(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        char input = scanner.next().charAt(0);
        scanner.nextLine();

        return input;
    }
}
