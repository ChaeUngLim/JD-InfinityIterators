package com.infinityiterators.Account;

import com.infinityiterators.view.LoginInput;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.infinityiterators.Account.SignupManager.accountList;

public class LoginManager {

    public void logIn(){

        LoginInput lm = new LoginInput();
    }

    // test용 삭제예정
    public static void main(String[] args) {
        accountList = new ArrayList<>() ;
        accountList.add(new UserDTO("id","pwd"));
        accountList.add(new UserDTO("id1","pwd1"));
        accountList.add(new UserDTO("id2","pwd"));

        LoginInput lm = new LoginInput()    ;
        lm.inputLoginData();
    }
}
