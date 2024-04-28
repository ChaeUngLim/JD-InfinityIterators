package com.infinityiterators.view.interaction;

import java.io.*;
import java.util.*;

public class Interaction {
    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        int input = scanner.nextInt();
        scanner.nextLine();

        return input;
    }

    public static String getString(String message) {
        Scanner scanner = new Scanner(System.in);

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        String input = scanner.nextLine();

        return input;
    }

    public static char getChar(String message) {
        Scanner scanner = new Scanner(System.in);

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        char input = scanner.next().charAt(0);
        scanner.nextLine();

        return input;
    }

    public static String getHiddenInput(String message) {
        Console console = System.console();
        if(console == null) throw new RuntimeException("Console not available");

        displayMessage(message + ": ", DisplayType.NORMAL, false);
        char[] password = console.readPassword();
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
