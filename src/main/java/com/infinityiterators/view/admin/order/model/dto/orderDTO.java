package com.infinityiterators.view.admin.order.model.dto;

public class orderDTO {
    private Long orderId; // 주문번호 (PK)
    private String product; // 제품
    private int orderQuantity; // 주문수량
    private String customer; // 주문자
    private LocalDate orderDate; // 주문일자
    private boolean isShipped; // 주문출고여부


    public orderDTO(Long orderId, String product, int orderQuantity, String customer, LocalDate orderDate, boolean isShipped) {
        this.orderId = orderId;
        this.product = product;
        this.orderQuantity = orderQuantity;
        this.customer = customer;
        this.orderDate = orderDate;
        this.isShipped = isShipped;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }
}


