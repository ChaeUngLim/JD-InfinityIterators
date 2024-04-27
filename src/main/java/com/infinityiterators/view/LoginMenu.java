package com.infinityiterators.view;

import com.infinityiterators.view.interaction.Interaction;

public class LoginMenu {
    private MenuContext menuContext;

    public LoginMenu() {
        menuContext = new MenuContext();
    }

    public void showMenu() {
        while(true) {
            // 1. 로그인/회원가입 메뉴 선택
            System.out.println("""
                ===================== 로그인/회원가입 =====================
                1. 로그인 / 2. 회원가입 / 3. 종료
                """);
            int selection = Interaction.getInt("메뉴를 선택해주세요: ");

            switch(selection) {
                case 1:
                    loginMenu();
                    break;
                case 2:
                    // 회원가입
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    private void loginMenu() {
        // 1. 로그인
        System.out.println("""
                ===================== 로그인 =====================
                """);
//        System.out.print("아이디: ");
//        String id = scanner.nextLine();
//        System.out.print("비밀번호: ");
//        String password = scanner.nextLine();
        String id = Interaction.getString("아이디: ");
        String password = Interaction.getString("비밀번호: ");


        // TODO. 로그인 인증 정보 요청(ACCOUNT)
        // 로그인 성공 시 해당 Account 객체 반환
        // 로그인 실패 시 null 반환

    }

    private void registerMenu() {
        // 2. 회원가입
        System.out.println("""
                ===================== 회원가입 =====================
                아이디: 
                비밀번호: 
                비밀번호 확인: 
                1. 회원가입 / 2. 뒤로가기
                """);
        System.out.print("메뉴를 선택해주세요: ");
    }
}
