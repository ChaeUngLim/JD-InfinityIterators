package com.infinityiterators.product;

import java.util.ArrayList;

public class ProductDto {

    ArrayList<ProductDto> productDTOArrayList;

    private int id;
    private String name;
    private double price;
    private String size;
    private int quantity;

    // 기본 생성자

    public ProductDto() {
    }


    // 생성자


    public ProductDto(int id, String name, double price, String size, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

