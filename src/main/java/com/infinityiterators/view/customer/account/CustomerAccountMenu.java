package com.infinityiterators.view.customer.account;

import com.infinityiterators.view.ISubMenuEntryPoint;
import com.infinityiterators.view.interaction.DisplayType;
import com.infinityiterators.view.interaction.Interaction;
import com.infinityiterators.view.interaction.MenuManager;

public class CustomerAccountMenu implements ISubMenuEntryPoint {
    @Override
    public void showEntryPointMenu() {
        Interaction.clearScreen();
        MenuManager.displayMenuHeader("사용자 계정 관리 메뉴(임시)"); // TODO. 임시입니다. 구현 대기

        // TODO. 현재 사용자의 계정 정보 출력
        // Interaction.displayMessage("현재 사용자의 계정 정보입니다.", DisplayType.DESCRIPTION, false);
        // Interaction.displayMessage("===========================================", DisplayType.DESCRIPTION, false);
        // Interaction.displayMessage("사용자 아이디: " + UserDTO.getId(), DisplayType.DESCRIPTION, false);
        // Interaction.displayMessage("사용자 이름: " + UserDTO.getName(), DisplayType.DESCRIPTION, false);
        // Interaction.displayMessage("사용자 비밀번호: " + UserDTO.getPw(), DisplayType.DESCRIPTION, false);
        // Interaction.displayMessage("사용자 생년월일: " + UserDTO.getBirthDate(), DisplayType.DESCRIPTION, false);
        // Interaction.displayMessage("사용자 가입 날짜: " + UserDTO.getJoinDate(), DisplayType.DESCRIPTION, false);
        // Interaction.displayMessage("===========================================", DisplayType.DESCRIPTION, false);


        MenuManager.displaySelectionMenu("아이디 수정", "비밀번호 수정", "회원 탈퇴", "뒤로 가기");
        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch(selection) {
            case 1:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
                // TODO. 아이디 수정 기능 구현
            case 2:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
                // TODO. 비밀번호 수정 기능 구현
            case 3:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
                // TODO. 회원 탈퇴 기능 구현
            case 4:
                Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
                return; // TODO. 메인 메뉴로 돌아가기
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;
        }
    }
}
