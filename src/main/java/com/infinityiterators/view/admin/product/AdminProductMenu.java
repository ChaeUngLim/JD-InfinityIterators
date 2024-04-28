package com.infinityiterators.view.admin.product;

import com.infinityiterators.view.*;
import com.infinityiterators.view.interaction.*;

public class AdminProductMenu implements ISubMenuEntryPoint {
    @Override
    public void showEntryPointMenu() {
        MenuManager.displayMenuHeader("관리자 상품 관리 메뉴");
        MenuManager.displaySelectionMenu("등록된 상품 목록 조회", "새 상품 등록", "상품 정보 수정", "등록된 상품 삭제", "뒤로 가기");

        int selection = Interaction.getInt("메뉴를 선택해주세요");

        switch(selection) {
            case 1:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
            case 2:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
            case 3:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
            case 4:
                Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                break;
            case 5:
                Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
                break;
            default:
                Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                break;
        }
    }
}
