package com.infinityiterators.order;

import com.infinityiterators.Account.UserDTO;
import com.infinityiterators.order.OrderDto;
import com.infinityiterators.order.OrderService;
import com.infinityiterators.product.ProductDto;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class OrderController{

//    public void AllSearchAccountDTO() {} // 장바구니에서 결제로 이동시 삭제되야해서 담고 있으면 안되서 사용 안함

/*주문목록 전체 조회*/
    public ArrayList<OrderDto> displayAllOrderList(){
        return new OrderService().orderDisplayAll();
    }

/*특정 사용자의 주문목록 조회*/
    public ArrayList<OrderDto> displayUserOrderList(UserDTO user){
        return new OrderService().findSomeonesOrderList(user);
    }


/*장바구니에 있는 항목 구매처리 -> 장바구니 비우기*/
    // 카트에 있는 상품 하나씩 주문처리
    public void purchaseProduct() throws Exception {
        ArrayList<OrderDto> cart = new OrderService().getCart();

        for(OrderDto item : cart) {
            new OrderService().sellProduct(item);
        }

        new OrderService().clearCart();
    }

    public void addProductToCart(UserDTO user, ProductDto product, int quantity) throws Exception {
        OrderDto order = new OrderDto(product, quantity, user);

        new OrderService().addProductToCart(order);
    }

    public void removeProductFromCart(OrderDto dto) {
        new OrderService().removeOneItemFromCart(dto);
    }

    public void clearCart() {   // 일딴 보류
        new OrderService().clearCart();
    }

//    public


}
