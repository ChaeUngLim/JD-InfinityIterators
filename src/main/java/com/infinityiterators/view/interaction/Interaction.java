package com.infinityiterators.view.interaction;

import java.io.*;
import java.util.*;

public class Interaction {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        int input = scanner.nextInt();
        scanner.nextLine();

        if(input < 0) throw new RuntimeException("음수는 입력할 수 없습니다.");

        return input;
    }

    public static String getString(String message) {
        Scanner scanner = new Scanner(System.in);

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        String input = scanner.nextLine();

        if(input.isBlank()) throw new RuntimeException("입력값이 없습니다.");
        return input;
    }

    public static char getChar(String message) {
        Scanner scanner = new Scanner(System.in);

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        char input = scanner.next().charAt(0);
        scanner.nextLine();

        if(input == ' ') throw new RuntimeException("입력값이 없습니다.");
        return input;
    }

    public static String getHiddenInput(String message) {
        Console console = System.console();
        if(console == null) throw new RuntimeException("Console not available");

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        char[] password = console.readPassword();

        if(password.length == 0) throw new RuntimeException("입력값이 없습니다.");

        return new String(password);
    }

    public static void displaySystemMessage(String message) {
        final String ANSI_PINK = "\u001B[95m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println(ANSI_PINK + message + ANSI_RESET);
    }

    public static void displayMessage(String message, DisplayType type, boolean returnLine) {
        System.out.print(type.getCode() + message + DisplayType.NORMAL.getCode());
        if(returnLine) System.out.println();
    }
}
