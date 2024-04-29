package com.infinityiterators.view.admin.account;

import com.infinityiterators.view.*;
import com.infinityiterators.view.interaction.*;

public class AdminAccountMenu implements ISubMenuEntryPoint {
    @Override
    public void showEntryPointMenu() {
        Interaction.clearScreen();
        MenuManager.displayMenuHeader("관리자 계정 관리 메뉴");

        // TODO.회원 목록 출력
        // for each 회원 in 회원목록
        // Interaction.displayMessage(회원.toString(), DisplayType.DESCRIPTION, false);

        MenuManager.displaySelectionMenu("회원 삭제", "뒤로 가기");
        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch(selection) {
            case 1:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
            case 4:
                Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
                return;
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;
        }
    }
}
