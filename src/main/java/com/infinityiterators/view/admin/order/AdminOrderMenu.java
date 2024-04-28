package com.infinityiterators.view.admin.order;

import com.infinityiterators.view.*;
import com.infinityiterators.view.interaction.*;

public class AdminOrderMenu implements ISubMenuEntryPoint {
    @Override
    public void showEntryPointMenu() {
        Interaction.clearScreen();
        // 주문 관리 메뉴
        // 기본적으로 메뉴 진입 시 주문 목록을 보여준다.
        // 주문 목록을 보여주고, 주문 상세 정보를 보여주는 기능을 제공한다. -> 주문 상세 정보 페이지에서 주문 출고 여부(boolean flag)를 변경할 수 있다.

        MenuManager.displayMenuHeader("관리자 주문 관리 메뉴");
        // TODO. 주문 목록 출력
        // for each 주문 in 주문목록
        // 주문고유번호, 주문자(성명), 주문일시, 주문금액, 주문상태 출력

        // 'q'입력 시 뒤로 가기
        int anInt = Interaction.getChar("자세히 보고 싶은 주문의 번호를 입력해주세요. 뒤로 가려면 'q'을 입력해주세요.");
        if (anInt == 'q') {
            Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
            return;
        }

        // TODO. 주문 상세 정보 출력
        // 주문고유번호, 주문자(성명), 주문일시, 주문금액, 주문상태, 주문상세목록 출력
        // 주문 상세 정보 페이지에서 주문 출고 여부(boolean flag)를 변경할 수 있다.
        // 주문 상세 정보 페이지에서 주문 출고 여부 변경 시, 주문 상태가 '출고 전'으로 변경된다.
        // 주문 상세 정보 페이지에서 주문 출고 여부 변경 시, 주문 상태가 '출고 완료'로 변경된다.

        // anInt -> int로 변환
        // 추후 ArrayList<Order> 타입으로 리스트 정보를 가져올 예정
        // Order 내부의 pk(int) 필드(기본키 격으로 auto_increment)와 anInt를 비교하여 일치하는 주문 정보를 가져온다.

        // 타입 변환 '1' -> 1
        int orderNumber = anInt - '0';

        // TODO. orderNumber로 ArrayList 내부 객체의 pk 필드 검색 후 일치하는 객체 정보 출력
    }
}
