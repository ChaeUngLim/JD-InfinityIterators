package com.infinityiterators.order;

import com.infinityiterators.Account.UserDTO;
import com.infinityiterators.order.OrderDto;
import com.infinityiterators.order.OrderService;
import com.infinityiterators.product.ProductDto;

import java.util.ArrayList;


public class OrderController{

//    public void AllSearchAccountDTO() {}

//    1. 목록정보 모두 출력
    public ArrayList<OrderDto> displayAllOrderList(){
        return new OrderService().displayAll();
    }

    public ArrayList<OrderDto> displayUserOrderList(UserDTO user){
        return new OrderService().
    }

    public void addProductToCart(UserDTO user, ProductDto product, int quantity) {
        OrderDto order = new OrderDto(product, quantity, user);

        new OrderService().addProductToCart(order);
    }

    public void removeProductFromCart(OrderDto dto) {
        new OrderService().removeOneItemFromCart(dto);
    }

    public void clearCart() {
        new OrderService().clearCart();
    }

    
}
