package com.infinityiterators.Account;

import java.time.LocalDate;
import java.util.ArrayList;

public class AccountService {
    public UserDTO login(String ID, String pwd) throws Exception {
        UserDTO userDTO = new AccountRepository().findAccount(ID, pwd);
        if(userDTO == null) throw new Exception("잘못된 아이디 혹은 비밀번호입니다.");

        return userDTO;
    }

    public void signup(UserDTO dto){
        new AccountRepository().addAccount(dto);
    }

    public boolean isDuplicatedId(String id) {
        if(new AccountRepository().findUserById(id) == null) return false;  // 중복사용자 없는 경우
        else return true;
    }

    public ArrayList<UserDTO> getAllUser() {
        return new AccountRepository().getAccountList();
    }

    public UserDTO findUserById(String id) {
        return new AccountRepository().findUserById(id);
    }
}
