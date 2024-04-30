package com.infinityiterators.product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductRepostiory {

    private static ArrayList<ProductDto> productDTOArrayList = new ArrayList<>();

    public void addProduct(ProductDto dto){
        productDTOArrayList.add(dto);
    }

    public ProductDto findProductByName(String name){
        for (ProductDto product : productDTOArrayList) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public ArrayList<ProductDto> getAllProducts(){
        return productDTOArrayList;
    }

    public void updateProduct(int index, ProductDto dto){
        if (index >= 0 && index < productDTOArrayList.size()) {
            productDTOArrayList.set(index, dto);
        }
    }

    public void removeProductByName(String name){
        for (int i = 0; i < productDTOArrayList.size(); i++){
            ProductDto product = productDTOArrayList.get(i);
            if (product.getName().equals(name)){
                productDTOArrayList.remove(i);
                break;
            }
        }
    }

    public void removeProduct(ProductDto dto){
        productDTOArrayList.remove(dto);
    }
}
