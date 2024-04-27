package com.infinityiterators.view.interaction;

import java.io.*;
import java.util.*;

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

    public static String getHiddenInput(String message) {
        Console console = System.console();
        if(console == null) throw new RuntimeException("Console not available");

        char[] password = console.readPassword(message);
        return new String(password);
    }
}
