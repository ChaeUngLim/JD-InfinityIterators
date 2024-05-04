package com.infinityiterators.order;

import com.infinityiterators.Account.UserDTO;
import com.infinityiterators.OrderRepository;
import com.infinityiterators.product.ProductDto;

import java.util.ArrayList;

public class OrderService {


    public ArrayList<OrderDto> orderDisplayAll() {		// 목록정보 모두 출력
        return new OrderRepository().getAllOrders();
    }

    public ArrayList<OrderDto> findSomeonesOrderList(UserDTO user) {
        return new OrderRepository().getOrdersFromSpecificUser(user);
    }
    public boolean isStockInsufficient(ProductDto product, int quantity) {
        int currentStock = product.getStock(); // 현재 재고수량
        currentStock -= quantity;

        if(currentStock < 0) { // 음수인 경우 재고부족
            return true;  // 재고부족
        } else
            return false; // 재고 있음
    }

    // 장바구니에 담긴 주문서를 하나씩 주문처리하는 로직
    public void sellProduct(OrderDto order) throws Exception {
        ProductDto product = order.getProduct(); // 사용자가 구매하려고 하는 제품
        int quantity = order.getQuantity();     // 사용자가 구매하고 싶은 수량

        boolean isInsufficient = isStockInsufficient(product, quantity);
        if(isInsufficient) throw new Exception("재고가 부족합니다.");

        // 재고수량 빼기처리
        product.setStock(product.getStock() - quantity); // 실제 재고 감산처리

        // 주문목록에 옮기기
        new OrderRepository().addOrder(order);
    }

    public ArrayList<OrderDto> getCart() {
        return new OrderRepository().getCart();
    }

    public void addProductToCart(OrderDto order) throws Exception {
        boolean isInsufficient = isStockInsufficient(order.getProduct(), order.getQuantity());
        if(isInsufficient) // 재고부족
            throw new Exception("재고가 부족합니다.");
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
