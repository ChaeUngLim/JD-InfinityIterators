package com.infinityiterators.Account;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.LocalDateTime.now;

public class AccountController {

    // 로그인
    public UserDTO login(String ID, String pwd) throws Exception {
        return new AccountService().login(ID, pwd);
    }


    // 회원가입
    public void signUp(String id, String pwd, String name, LocalDate birthDate, boolean adminStatus) throws Exception {
        // 중복id체크
        boolean isDuplicatedId = new AccountService().isDuplicatedId(id);
        if(isDuplicatedId) throw new Exception("중복된 id입니다.");

        // 회원가입처리
        UserDTO newUser = new UserDTO(id, pwd, name, birthDate, adminStatus);

        // service에다가 회원목록에 저장해줘~ 라고 객체를 넘겨주면서 요청한다.
        new AccountService().signup(newUser);
    }

    public ArrayList<UserDTO> getAllUser() {
        return new AccountService().getAllUser();
    }

    public UserDTO findUserById(String id) throws Exception {
        UserDTO userById = new AccountService().findUserById(id);
        if(userById == null) throw new Exception("해당 사용자가 없습니다.");

        return userById;
    }
}




//        Scanner sc = new Scanner(System.in);
//        UserDTO u = new UserDTO();
//
//        System.out.println("아이디를 입력하세요 : ");
//        u.setID(sc.nextLine());
//        for (UserDTO pk : accountList) {
//            if (pk == null) continue;
//
//            if (pk.getID() == u.getID()) {
//                System.out.println("이미 사용중인 아이디입니다.");
//            }
//        }
//
//
//        System.out.println("비밀번호를 입력하세요 : ");
//        u.setPwd(sc.nextLine());
//
//        System.out.println("이름을 입력하세요 : ");
//        u.setName(sc.nextLine());
//
//        System.out.println("생년월일을 입력하세요(YYYY-MM-DD) : ");
//        u.setBirthDate(sc.nextLine());
//
//        System.out.println("1. 관리자로 회원가입, 2. 일반 사용자로 회원가입 : ");
//        u.setAdminStatus((sc.nextInt() == 1) ? true : false);
//
//        u.setRegisterDate(now());
//
//        return u;