package com.infinityiterators.view.customer.order;

import com.infinityiterators.deps.Dependencies;
import com.infinityiterators.product.ProductController;
import com.infinityiterators.product.ProductDto;
import com.infinityiterators.view.ISubMenuEntryPoint;
import com.infinityiterators.view.interaction.DisplayType;
import com.infinityiterators.view.interaction.Interaction;
import com.infinityiterators.view.interaction.MenuManager;

public class CustomerOrderedItemsMenu implements ISubMenuEntryPoint {
    private Dependencies di;
    public CustomerOrderedItemsMenu(Dependencies di) {
        this.di = di;
    }
    public void showEntryPointMenu() {
        Interaction.clearScreen();

        MenuManager.displayMenuHeader("주문 내역 조회 메뉴");
        // 사용자가 주문(구매)를 했던 내용을 출력.
        Interaction.displayMessage("주문 내역", DisplayType.SYSTEM, true);
        Interaction.displayMessage("주문 번호\t상품 ID\t상품 이름\t상품 가격\t상품 수량", DisplayType.SYSTEM, true);

        // TODO. 주문(구매)한 내용을 출력하는 기능 필요.

        MenuManager.displaySelectionMenu("뒤로 가기");
        int selection = Interaction.getInt("메뉴를 선택해주세요");
        switch (selection) {
            case 1:
                Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
                return;
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;
        }








    }
}
