package com.infinityiterators.product;

import java.util.ArrayList;

public class ProductRepostiory {

    private ArrayList<ProductDto> productDTOArrayList;

    public ProductRepostiory(){
        this.productDTOArrayList = new ArrayList<>();
    }

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

    public void updateProduct(int index, ProductDto dto){
        if (index >= 0 && index < productDTOArrayList.size()) {
            productDTOArrayList.set(index, dto);
        }
    }

    public void removeProduct(String name){
        for (int i = 0; i < productDTOArrayList.size(); i++){
            ProductDto product = productDTOArrayList.get(i);
            if (product.getName().equals(name)){
                productDTOArrayList.remove(i);
                break;
            }
        }
    }
}
