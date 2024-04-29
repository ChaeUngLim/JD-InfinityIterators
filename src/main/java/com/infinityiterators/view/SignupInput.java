package com.infinityiterators.view;

import com.infinityiterators.Account.UserDTO;

import java.util.Scanner;

import static com.infinityiterators.Account.SignupManager.accountList;
import static java.time.LocalDateTime.now;


public class SignupInput {

    public UserDTO inputAccount(){

        Scanner sc = new Scanner(System.in);
        UserDTO u = new UserDTO();

        System.out.println("아이디를 입력하세요 : ");
        u.setID(sc.nextLine());
        for(UserDTO pk : accountList){
            if (pk == null) continue;

            if(pk.getID() == u.getID()){
                System.out.println("이미 사용중인 아이디입니다.");
            }
        }


        System.out.println("비밀번호를 입력하세요 : ");
        u.setPwd(sc.nextLine());

        System.out.println("이름을 입력하세요 : ");
        u.setName(sc.nextLine());

        System.out.println("생년월일을 입력하세요(YYYY-MM-DD) : ");
        u.setBirthDate(sc.nextLine());

        System.out.println("1. 관리자로 회원가입, 2. 일반 사용자로 회원가입 : ");
        u.setAdminStatus((sc.nextInt() == 1) ? true : false);

        u.setRegisterDate(now());

        return u;
    }
}
