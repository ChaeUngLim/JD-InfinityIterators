package com.infinityiterators.view.customer.cart;

import com.infinityiterators.product.ProductController;
import com.infinityiterators.product.ProductDto;
import com.infinityiterators.view.ISubMenuEntryPoint;
import com.infinityiterators.view.interaction.DisplayType;
import com.infinityiterators.view.interaction.Interaction;
import com.infinityiterators.view.interaction.MenuManager;

public class CartMenu implements ISubMenuEntryPoint {
    public void showEntryPointMenu() {
        Interaction.clearScreen();

        MenuManager.displayMenuHeader("장바구니 조회 메뉴");

        // 현재 장바구니에 담긴 상품들을 출력해주는 기능
        Interaction.displayMessage("현재 장바구니에 담긴 상품들입니다.", DisplayType.SYSTEM, true);
        Interaction.displayMessage("상품 ID\t상품 이름\t상품 가격\t상품 수량", DisplayType.SYSTEM, true);


        for (ProductDto dto : new ProductController().getAllProducts()) {
            Interaction.displayMessage(dto.getId() + "\t" + dto.getName() + "\t" + dto.getPrice() + "\t" + dto.getStock(), DisplayType.SYSTEM, true);

        }
        MenuManager.displaySelectionMenu("모두 구매하기", "장바구니 초기화", "뒤로 가기");
        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch (selection) {
            case 1: // 모두 구매하기
                // TODO. 장바구니에 담긴 모든 상품을 주문하는 기능 필요
                break;
            case 2: // 장바구니 초기화
                Interaction.displayMessage("장바구니를 초기화합니다.", DisplayType.SYSTEM, true);
                // TODO. 장바구니 초기화 기능 구현
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
