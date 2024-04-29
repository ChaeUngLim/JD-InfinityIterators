package com.infinityiterators.view;

import com.infinityiterators.Account.SignupManager;
import com.infinityiterators.Account.UserDTO;

import java.util.Scanner;

import static com.infinityiterators.Account.SignupManager.accountList;

public class LoginInput {

    public UserDTO inputLoginData(){

        Scanner sc = new Scanner(System.in);
        UserDTO l = new UserDTO();

        int index = -1;

        while(true){
            System.out.println("아이디 : ");
            l.setID(sc.nextLine());
            System.out.println("비밀번호 : ");
            l.setPwd(sc.nextLine());

            for(int i = 0; i < accountList.size(); i++){

                if(accountList.get(i).getID().equals(l.getID())){
                    index = i;
                }
            }

            if (index == -1){
                System.out.println("존재하지 않는 아이디입니다. 다시 입력해주세요.");
                continue;
            }

            if(!accountList.get(index).getPwd().equals(l.getPwd())){
                System.out.println("비밀번호가 맞지 않습니다. 다시 입력해주세요.");
                continue;
            } else{
                System.out.println("로그인되었습니다.");
            }

            break;
        }
        return accountList.get(index);
    }
}
