package com.infinityiterators.product;

import java.util.ArrayList;

public class ProductController {

    public void addNewProduct(int id, String name, double price, String size, int quantity){} // 상품 등록

    public ProductDto searchProductByName(String name){return null;}// 상품 검색(이름으로)

    public void modifyProductInfo(ProductDto dto){}// 수정

    public void removeProduct(ProductDto dto){}  // 수정

    public ArrayList<ProductDto> getAllProducts(){return null;}

}
