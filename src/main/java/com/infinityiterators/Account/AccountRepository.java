package com.infinityiterators.Account;

import java.util.ArrayList;

public class AccountRepository {
    private static ArrayList<UserDTO> accountList = new ArrayList<>();

    public ArrayList<UserDTO> getAccountList() {
        return accountList;
    }

    public void addAccount(UserDTO userDTO) {
        accountList.add(userDTO);
    }

    public void removeAccount(UserDTO userDTO) {
        accountList.remove(userDTO);
    }

    public UserDTO findAccount(String id, String pwd) {
        /*
        private String ID;
        private String pwd;
         */
        // 두 정보가 모두 일치하는 계정을 찾아 반환
        for (UserDTO userDTO : accountList) {
            if (userDTO.getID().equals(id) && userDTO.getPwd().equals(pwd)) {
                return userDTO;
            }
        }
        return null;
    }
}
