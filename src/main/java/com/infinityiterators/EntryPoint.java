package com.infinityiterators;

import com.infinityiterators.view.*;
import com.infinityiterators.view.interaction.DisplayType;
import com.infinityiterators.view.interaction.Interaction;

public class EntryPoint {
    private AccountMainMenu accountMainMenu;
    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint();

        entryPoint.accountMainMenu = new AccountMainMenu();
        entryPoint.accountMainMenu.showMenu();
    }
}