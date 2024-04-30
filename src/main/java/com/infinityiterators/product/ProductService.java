package com.infinityiterators.product;

import java.util.ArrayList;

public class ProductService {

    public boolean checkDuplicateProductName(ProductDto dto){
        return false;
    }


    public void createProduct(ProductDto dto){

    }

    public ProductDto searchProductByName(String name){
        return null;
    }

    public ArrayList<ProductDto> getAllProduct(){
        return null;
    }

    public void handleInvalidInput(){
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
    }
}
