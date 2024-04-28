package com.infinityiterators;

import com.infinityiterators.view.*;

public class EntryPoint {
    private AccountMainMenu accountMainMenu;
    public static void main(String[] args) {
        com.infinityiterators.EntryPoint entryPoint = new com.infinityiterators.EntryPoint();
        entryPoint.accountMainMenu = new AccountMainMenu();
        entryPoint.accountMainMenu.showMenu();
    }
}