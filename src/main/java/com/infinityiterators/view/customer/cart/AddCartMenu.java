package com.infinityiterators.view.customer.cart;

import com.infinityiterators.view.ISubMenuEntryPoint;
import com.infinityiterators.view.customer.cart.*;
import com.infinityiterators.view.interaction.*;
import com.infinityiterators.product.*;

public class AddCartMenu implements ISubMenuEntryPoint {
    public void showEntryPointMenu() {
        Interaction.clearScreen();

        MenuManager.displayMenuHeader("장바구니 메뉴");
        // 상품의 전체 정보 출력 (Product의 getAllProducts() 메소드 이용)
        Interaction.displayMessage("상품 목록", DisplayType.SYSTEM, true);
        Interaction.displayMessage("상품 ID\t상품 이름\t상품 가격\t상품 수량", DisplayType.SYSTEM, true);
        for (ProductDto dto : new ProductController().getAllProducts()) {
            Interaction.displayMessage(dto.getId() + "\t" + dto.getName() + "\t" + dto.getPrice() + "\t" + dto.getQuantity(), DisplayType.SYSTEM, true);
        }

        // TODO. 현재 메뉴에서 상품의 번호와 갯수를 입력받아 구매하기(주문하기) 기능 구현
        // TODO. 장바구니 조회 기능 구현
        MenuManager.displaySelectionMenu("바로 구매하기", "장바구니 조회", "뒤로 가기");
        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch (selection) {
            case 1: // 바로 구매하기
                // TODO. 장바구니에 상품을 추가하는 기능 필요
                break;
            case 2: // 장바구니 조회
                Interaction.displayMessage("장바구니 조회 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                new CartMenu().showEntryPointMenu();
                break;
            case 3: // 뒤로 가기
                Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
                return;
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;

        }


    }

}
