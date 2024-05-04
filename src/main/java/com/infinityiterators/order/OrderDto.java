package com.infinityiterators.order;

import com.infinityiterators.Account.UserDTO;
import com.infinityiterators.product.ProductDto;

import java.net.UnknownServiceException;
import java.time.*;

public class OrderDto {
    private static int idCount = 0;
    private long orderId;
    private ProductDto product;
    private int quantity;

    private UserDTO user;
    private LocalDateTime orderDate;
    private boolean isShipped = false;

    public OrderDto(ProductDto product, int quantity, UserDTO user) {
        this.orderId = idCount++;
        this.product = product;
        this.quantity = quantity;
        this.user = user;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }
}



