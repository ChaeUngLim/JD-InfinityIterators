package com.infinityiterators.Account;

import com.infinityiterators.view.SignupInput;

import java.util.ArrayList;

public class SignupManager {
    public static ArrayList<UserDTO> accountList;

    public void signUp() {

        SignupInput sm = new SignupInput();
        accountList.add(sm.inputAccount());

    }

    // test용
    public static void main(String[] args) {
        accountList = new ArrayList<>();

        SignupInput sm = new SignupInput();
        accountList.add(sm.inputAccount());

        for (UserDTO u : accountList) {
            System.out.println(u.toString());
        }
        ;

    }
}
