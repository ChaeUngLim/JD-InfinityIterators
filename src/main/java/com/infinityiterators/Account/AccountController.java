package com.infinityiterators.Account;

import com.infinityiterators.view.LoginInput;

import java.time.LocalDate;
import java.util.Scanner;

import static com.infinityiterators.Account.SignupManager.accountList;
import static java.time.LocalDateTime.now;

public class AccountController {

    // 로그인
    public UserDTO loginInput(String ID, String pwd) throws Exception {
        try {
            return new AccountService().login(ID, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
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


    // 회원가입
    public UserDTO signupInput(String id, String pwd, String name, LocalDate birthDate, boolean adminStatus){
        Scanner sc = new Scanner(System.in);
        UserDTO u = new UserDTO();

        System.out.println("아이디를 입력하세요 : ");
        u.setID(sc.nextLine());
        for (UserDTO pk : accountList) {
            if (pk == null) continue;

            if (pk.getID() == u.getID()) {
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
