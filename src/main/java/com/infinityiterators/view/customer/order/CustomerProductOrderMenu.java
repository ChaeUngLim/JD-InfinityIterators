package com.infinityiterators.view.customer.order;

import com.infinityiterators.deps.Dependencies;
import com.infinityiterators.product.*;
import com.infinityiterators.view.ISubMenuEntryPoint;
import com.infinityiterators.view.customer.cart.*;
import com.infinityiterators.view.interaction.*;

public class CustomerProductOrderMenu implements ISubMenuEntryPoint {
    private Dependencies di;
    public CustomerProductOrderMenu(Dependencies di) {
        this.di = di;
    }
    public void showEntryPointMenu() {
        Interaction.clearScreen();

        MenuManager.displayMenuHeader("고객 상품 주문 메뉴");

        // 상품의 전체 정보 우선 출력 (Product의 getAllProducts() 메소드 이용)
        Interaction.displayMessage("상품 목록", DisplayType.SYSTEM, true);
        Interaction.displayMessage("상품 ID\t상품 이름\t상품 가격\t상품 수량", DisplayType.SYSTEM, true);
//        for (ProductDto dto : new ProductController().getAllProducts()) {
//            Interaction.displayMessage(dto.getId() + "\t" + dto.getName() + "\t" + dto.getPrice() + "\t" + dto.getQuantity(), DisplayType.SYSTEM, true);
//        }

        MenuManager.displaySelectionMenu("장바구니 담기", "장바구니 조회", "뒤로 가기");

        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch(selection) {
            case 1: // 장바구니 담기 메뉴로 이동(AddCartMenu로 이동)
                Interaction.displayMessage("장바구니 담기 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                new AddCartMenu().showEntryPointMenu();
                break;
            case 2: // 장바구니 조회 메뉴로 이동(CartMenu로 이동)
                Interaction.displayMessage("장바구니 조회 메뉴로 이동합니다.", DisplayType.SYSTEM, true);
                new CartMenu().showEntryPointMenu();
                break;
            case 3: // 뒤로 가기(MainMenu로 이동)
                Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
                return;
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;
        }
    }
}
