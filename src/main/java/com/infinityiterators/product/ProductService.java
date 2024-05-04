package com.infinityiterators.product;

import java.util.ArrayList;

public class ProductService {
    public boolean checkDuplicateProductName(ProductDto dto){
        // ProductRepository에서 상품 이름 중복 체크
        var isDuplicated = new ProductRepostiory().findProductByName(dto.getName());

        if(isDuplicated == null) return false;
        else return true;
    }





    public void addNewProduct(ProductDto dto){
        // ProductRepository에서 상품 추가
        new ProductRepostiory().addProduct(dto);

    }

    public ProductDto searchProductByName(String name){
        return new ProductRepostiory().findProductByName(name);
    }

    public ArrayList<ProductDto> getAllProduct(){
        return new ProductRepostiory().getAllProducts();
    }

    public void removeProduct(ProductDto dto){
        // ProductRepository에서 상품 삭제
        new ProductRepostiory().removeProduct(dto);
    }
}
