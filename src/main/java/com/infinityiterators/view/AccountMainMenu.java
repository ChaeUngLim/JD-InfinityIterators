package com.infinityiterators.view;

import com.infinityiterators.view.interaction.Interaction;

import java.time.LocalDateTime;

public class AccountMainMenu {
    private MenuContext menuContext;

    public AccountMainMenu() {
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
                    registerMenu();
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
        String id = Interaction.getString("아이디: ");
//        String password = Interaction.getString("비밀번호: ");
        String password = Interaction.getHiddenInput("비밀번호: "); // 일반 콘솔에서만 동작(IDE에서는 동작하지 않음)

        // TODO. 로그인 인증 정보 요청(ACCOUNT)
        // 로그인 성공 시 해당 Account 객체 반환
        // 로그인 실패 시 null 반환
        // CHECK: 로그인 실패의 경우 Exception 전달받아 직접 처리

    }

    private void registerMenu() {
        // 2. 회원가입
        System.out.println("""
                ===================== 회원가입 =====================
                """);
        String id = Interaction.getString("아이디: "); // 중복 체크 필요
        // TODO. 중복 아이디 체크(Account)

        String password = Interaction.getHiddenInput("비밀번호: "); // 일반 콘솔에서만 동작(IDE에서는 동작하지 않음)

        final int PASSWORD_CONFIRM_MAX_TRIAL = 3;
        int passwordConfirmTrial = 0;
        do {
            String passwordConfirm = Interaction.getHiddenInput("비밀번호 확인: "); // 일반 콘솔에서만 동작(IDE에서는 동작하지 않음)
            if(password.equals(passwordConfirm)) break;

            passwordConfirmTrial++;
            // 비밀번호 확인 실패 안내 메시지 + 재입력(현재 횟수 출력)
            System.out.println("비밀번호 확인 실패(" + passwordConfirmTrial + "/" + PASSWORD_CONFIRM_MAX_TRIAL + ")");

            if(passwordConfirmTrial >= PASSWORD_CONFIRM_MAX_TRIAL) {
                System.out.println("비밀번호 확인 실패 횟수 초과(3회) - 회원가입 프로세스 종료");
                return;
            }
        } while(true); // 비밀번호 확인이 일치할 때까지 반복

        String passwordConfirm = Interaction.getHiddenInput("비밀번호 확인: "); // 일반 콘솔에서만 동작(IDE에서는 동작하지 않음)

        String name = Interaction.getString("이름: ");
        String birthDate = Interaction.getString("생년월일(YYYY-MM-DD): ");

        char adminStatus = Interaction.getChar("관리자 여부(Y/N): ");
        boolean isAdmin = adminStatus == 'Y' || adminStatus == 'y'; // char -> boolean

        LocalDateTime registerDate = LocalDateTime.now();

        // TODO. 회원가입 정보 저장 요청(Account)
    }
}
