package com.infinityiterators.order;

import com.infinityiterators.Account.UserDTO;
import com.infinityiterators.product.ProductDto;

import java.util.*;

public class OrderRepository {
    private        ArrayList<CartDto> cart = new ArrayList<>(); // cart 주문내역들에서 주문 orders 담을시 cart 삭제함으로 statsic 사용 안됨
    private static ArrayList<OrderDto> ordersDTOArrayList = new ArrayList<>();


    public ArrayList<OrderDto> getAllOrders() {
        return ordersDTOArrayList;
    }

    public ArrayList<OrderDto> getCart() {
        return cart;
    }

    public void addOrder(OrderDto ordersDTOArrayList) {
        orders.add(ordersDTOArrayList);
    }

    public void addCart(OrderDto ordersDTOArrayList) {
        cart.add(ordersDTOArrayList);
    }

    public void removeCart(OrderDto ordersDTOArrayList) {
        cart.remove(ordersDTOArrayList);
    }

    public void clearCart() {
        cart.clear();
    }

    public void removeOrder(OrderDto ordersDTOArrayList) {
        orders.remove(ordersDTOArrayList);
    }


    public ArrayList<OrderDto> getOrdersFromSpecificUser(UserDTO userdto) {
        ArrayList<OrderDto> foundItems = new ArrayList<>();

        for(OrderDto order : ordersDTOArrayList) {

            if(order.getUser().equals(userdto)) {
                foundItems.add(order);              // 유저 = 오더 같으면 넣어주기
            }
        }

        return foundItems;
    }






}