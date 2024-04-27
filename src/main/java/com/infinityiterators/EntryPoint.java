package com.infinityiterators;

import com.infinityiterators.view.LoginMenu;
import com.infinityiterators.view.interaction.Interaction;

public class EntryPoint {
    private LoginMenu loginMenu;
    public static void main(String[] args) {
//        com.infinityiterators.EntryPoint entryPoint = new com.infinityiterators.EntryPoint();
//        entryPoint.loginMenu = new LoginMenu();
//        entryPoint.loginMenu.showMenu();

        String hiddenInput = Interaction.getHiddenInput("비밀번호를 입력해주세요: ");
        System.out.println(hiddenInput);
    }
}
