package com.infinityiterators.view.admin;

import com.infinityiterators.view.*;

import com.infinityiterators.view.admin.account.*;
import com.infinityiterators.view.admin.order.*;
import com.infinityiterators.view.admin.product.*;

import com.infinityiterators.view.interaction.*;

import java.awt.*;

public class AdminMenu implements IMenuStrategyByType {
    public void showMenu() {
        MenuManager.displayMenuHeader("관리자 메뉴");
        MenuManager.displaySelectionMenu("회원 관리", "상품 관리", "주문 관리", "로그아웃");

        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch(selection) {
            case 1:
                // 회원 관리
                Interaction.displayMessage("회원 관리 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                new AdminAccountMenu().showEntryPointMenu();
                break;
            case 2:
                // 상품 관리
                Interaction.displayMessage("상품 관리 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                new AdminProductMenu().showEntryPointMenu();
                break;
            case 3:
                // 주문 관리
                Interaction.displayMessage("주문 관리 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                new AdminOrderMenu().showEntryPointMenu();
                break;
            case 4:
                Interaction.displayMessage("로그아웃합니다.", DisplayType.SYSTEM, true);
                // TODO. 로그아웃 처리
                break;
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;
        }
    }
}
