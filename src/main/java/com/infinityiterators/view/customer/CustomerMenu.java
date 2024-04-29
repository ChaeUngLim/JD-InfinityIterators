package com.infinityiterators.view.customer;

import com.infinityiterators.view.*;


import com.infinityiterators.view.customer.account.*;
import com.infinityiterators.view.customer.order.CustomerOrderedItemsMenu;
import com.infinityiterators.view.customer.order.CustomerProductOrderMenu;
import com.infinityiterators.view.customer.product.CustomerProductMenu;
import com.infinityiterators.view.interaction.*;

public class CustomerMenu implements IMenuStrategyByType {
    public void showMenu() {
        Interaction.clearScreen();

        MenuManager.displayMenuHeader("고객 메뉴");
        MenuManager.displaySelectionMenu("상품 조회 및 주문", "주문 내역 조회", "회원 정보 수정(임시)", "로그아웃");
        while (true) {
            int selection = Interaction.getInt("메뉴를 선택해주세요");

            switch (selection) {
                case 1:
                    // 주문 관리
                    Interaction.displayMessage("상품 조회 및 주문 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                    new CustomerProductOrderMenu().showEntryPointMenu();
                    break;
                case 2:
                    // 주문 내역 조회
                    Interaction.displayMessage("주문 내역 조회 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                    new CustomerOrderedItemsMenu().showEntryPointMenu();
                    break;
                case 3:
                    // 회원 관리
                    Interaction.displayMessage("회원 정보 수정 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                    new CustomerAccountMenu().showEntryPointMenu();
                    break;
                case 4:
                    Interaction.displayMessage("로그아웃합니다.", DisplayType.SYSTEM, true);
                    // TODO. 로그아웃 처리
                    return; // 로그아웃 시 메인 메뉴(로그인 화면)로 이동
                default:
                    Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                    break;
            }
        }
    }
}
