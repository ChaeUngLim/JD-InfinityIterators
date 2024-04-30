package com.infinityiterators.Account;

public class AccountService {
    public UserDTO login(String ID, String pwd) throws Exception {
        UserDTO userDTO = new AccountRepository().findAccount(ID, pwd);
        if(userDTO == null) throw new Exception("잘못된 아이디 혹은 비밀번호입니다.");
    }
}
