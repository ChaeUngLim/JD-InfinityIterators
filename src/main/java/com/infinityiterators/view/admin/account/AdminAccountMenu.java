package com.infinityiterators.view.admin.account;

import com.infinityiterators.view.*;
import com.infinityiterators.view.interaction.*;

public class AdminAccountMenu implements ISubMenuEntryPoint {
    @Override
    public void showEntryPointMenu() {
        MenuManager.displayMenuHeader("관리자 메뉴");
        MenuManager.displaySelectionMenu("회원 관리", "상품 관리", "주문 관리", "로그아웃");

        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch(selection) {
            case 1:
                // 회원 관리
                Interaction.displayMessage("회원 관리 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                break;
            case 2:
                // 상품 관리
                Interaction.displayMessage("상품 관리 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                break;
            case 3:
                // 주문 관리
                Interaction.displayMessage("주문 관리 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                break;
            case 4:
                // 로그아웃
                Interaction.displayMessage("로그아웃합니다.", DisplayType.SYSTEM, true);
                break;
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;
        }
    }
}
