package com.infinityiterators.order;

import com.infinityiterators.Account.UserDTO;

import java.util.*;

public class OrderRepository {
    private        ArrayList<OrderDto> cart = new ArrayList<>(); // cart 주문내역들에서 주문 orders 담을시 cart 삭제함으로 statsic 사용 안됨
    private static ArrayList<OrderDto> orders = new ArrayList<>();


    public ArrayList<OrderDto> getAllOrders() {
        return orders;
        // select * from ...
    }

    public ArrayList<OrderDto> getCart() {
        return cart;
    }

    public void addOrder(OrderDto order) {
        orders.add(order);
    }

    public void addCart(OrderDto order) {
        cart.add(order);
    }

    public void removeCart(OrderDto order) {
        cart.remove(order);
    }

    public void clearCart() {
        cart.clear();
    }

    public void removeOrder(OrderDto order) {
        orders.remove(order);
    }

    public ArrayList<OrderDto> getOrdersFromSpecificUser(UserDTO dto) {
        ArrayList<OrderDto> foundItems = new ArrayList<>();

        for(OrderDto order : orders) {
            if(order.getUser().equals(dto)) foundItems.add(order);
        }

        return foundItems;
    }
}