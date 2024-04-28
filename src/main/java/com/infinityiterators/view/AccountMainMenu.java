package com.infinityiterators.view;

import com.infinityiterators.view.interaction.*;

import java.awt.*;
import java.time.LocalDateTime;

public class AccountMainMenu {
    private MenuContext menuContext;

    public AccountMainMenu() {
        menuContext = new MenuContext();
    }

    public void showMenu() {
        while (true) {
            MenuManager.displayMenuHeader("로그인/회원가입");
            MenuManager.displaySelectionMenu("로그인", "회원가입", "종료");

            int selection = Interaction.getInt("메뉴를 선택해주세요");

            switch (selection) {
                case 1:
                    loginMenu();
                    break;
                case 2:
                    registerMenu();
                    break;
                case 3:
                    Interaction.displayMessage("프로그램을 종료합니다.", DisplayType.SYSTEM, true);
                    System.exit(0);
                    break;
                default:
                    Interaction.displayMessage("잘못된 입력입니다", DisplayType.ERROR, true);
                    break;
            }
        }
    }

    private void loginMenu() {  // 탈출 시퀸스 필요
        MenuManager.displayMenuHeader("로그인");

        String id = Interaction.getString("아이디");
        String password = Interaction.getHiddenInput("비밀번호"); // 일반 콘솔에서만 동작(IDE에서는 동작하지 않음)

        // TODO. 로그인 인증 정보 요청(ACCOUNT)
        // 로그인 성공 시 해당 Account 객체 반환
        // 로그인 실패 시 null 반환
        // CHECK: 로그인 실패의 경우 Exception 전달받아 직접 처리

        // UserDto userDto = login();
        // if(userDto !=) null

        // if(userDto.isAdmin()) // 관리자 메뉴로 이동
        // else // 사용자 메뉴로 이동
    }

    private void registerMenu() {
        MenuManager.displayMenuHeader("회원가입");

        String id = Interaction.getString("아이디를 입력해 주세요"); // 중복 체크 필요
        // TODO. 중복 아이디 체크(Account)
        // 중복 아이디인 경우 다시 입력 요청
        // Interaction.displayMessage("이미 사용 중인 아이디입니다. 다시 입력해 주세요", DisplayType.ERROR, true);

        String password = Interaction.getHiddenInput("비밀번호를 입력해 주세요"); // 일반 콘솔에서만 동작(IDE에서는 동작하지 않음)

        final int PASSWORD_CONFIRM_MAX_TRIAL = 3;
        int passwordConfirmTrial = 0;
        do {
            String passwordConfirm = Interaction.getHiddenInput("비밀번호를 다시 한 번 입력해 주세요"); // 일반 콘솔에서만 동작(IDE에서는 동작하지 않음)
            if (password.equals(passwordConfirm)) break;

            passwordConfirmTrial++;
            // 비밀번호 확인 실패 안내 메시지 + 재입력(현재 횟수 출력)
            Interaction.displayMessage("비밀번호 확인 실패(" + passwordConfirmTrial + "/" + PASSWORD_CONFIRM_MAX_TRIAL + ")", DisplayType.ERROR, true);

            if (passwordConfirmTrial >= PASSWORD_CONFIRM_MAX_TRIAL) {
                Interaction.displayMessage("비밀번호 확인 실패 횟수 초과(3회) - 회원가입 프로세스 종료", DisplayType.ERROR, true);
                return;
            }
        } while (true); // 비밀번호 확인이 일치할 때까지 반복

        String name = Interaction.getString("성명을 입력해 주세요");
        String birthDate = Interaction.getString("생년월일(YYYY-MM-DD)을 입력해 주세요");

        char adminStatus = Interaction.getChar("관리자로 등록하시겠습니까?(Y/N)");
        boolean isAdmin = Character.toString(adminStatus).equalsIgnoreCase("Y");

        LocalDateTime registerDate = LocalDateTime.now();   // 가입일자 및 시간: 객체 생성 시점으로 위임

        // TODO. 회원가입 정보 저장 요청(Account)
    }
}
