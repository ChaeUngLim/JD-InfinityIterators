package com.infinityiterators.order;

import com.infinityiterators.Account.UserDTO;
import com.infinityiterators.OrderRepository;

import java.util.ArrayList;

public class OrderService {


    public ArrayList<OrderDto> displayAll() {		// 목록정보 모두 출력
        return new OrderRepository().getAllOrders();
    }

    public ArrayList<OrderDto> findSomeonesOrderList(UserDTO dto) {
        return new OrderRepository()
    }

    public void addProductToCart(OrderDto order) {
        new OrderRepository().addCart(order);
    }

    public void removeOneItemFromCart(OrderDto order) {
        new OrderRepository().removeCart(order);
    }

    public void clearCart() {
        new OrderRepository().clearCart();
    }


//    public void clearCart() {
//        재고 확인 메소드
//        public class InventoryManager {
//            // 재고 확인 메소드
//            public static String checkInventory(int quantity) {
//                if (quantity > 0) {
//                    return "충분한 재고가 있습니다.";
//                } else if (quantity == 0) {
//                    return "재고가 소진되었습니다.";
//                } else {
//                    return "음수의 재고는 존재하지 않습니다.";
//                }
//            }
//
//            public static void main(String[] args) {
//                int currentInventory = 10; // 재고 수량 (예시)
//                String inventoryStatus = checkInventory(currentInventory);
//                System.out.println("재고 상태: " + inventoryStatus);
//            }


}
