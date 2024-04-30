package com.infinityiterators.order;

import java.util.*;

public class OrderRepository {
    private static ArrayList<OrderDto> orders = new ArrayList<>();
    private ArrayList<OrderDto> cart = new ArrayList<>();

    public ArrayList<OrderDto> getOrders() {
        return orders;
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
}
