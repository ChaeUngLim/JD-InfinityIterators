package com.infinityiterators.product;

public class ProductDto {
    private static int idCounter = 0;
    private int id;
    private String name;
    private double price;
    private String size;    // size of the clothes
    private int stock;

    public ProductDto(String name, double price, String size, int stock) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
        this.size = size;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", quantity=" + stock +
                '}';
    }
}

