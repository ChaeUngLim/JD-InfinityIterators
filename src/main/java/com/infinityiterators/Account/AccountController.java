package com.infinityiterators.Account;

public class AccountController {
    public UserDTO login(String ID, String pwd) throws Exception {
        try {
            return new AccountService().login(ID, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
