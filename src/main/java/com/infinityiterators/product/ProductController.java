package com.infinityiterators.product;

import java.util.ArrayList;

public class ProductController {

    private ArrayList<String> products;
    public ProductController(){
        this.products = new ArrayList<>();
    }

    public void addNewProduct(ProductDto product){          // 상품 등록
        products.add(1,"중");
    }

    public ProductDto searchProductByName(String name){     // 상품 검색(이름으로)
        for (ProductDto products : getAllProducts()) {
            if (products.getName().equals(name)){
                return products;
            }
        }
        return null;
    }

    public void modifyProductInfo(ProductDto dto){          // 수정
        for (ProductDto products : getAllProducts()) {
            if (products.getId() == dto.getId()){
                products.setName(dto.getName());
                products.setPrice(dto.getPrice());
                products.setSize(dto.getSize());
                products.setQuantity(dto.getQuantity());
                break;
            }
        }
    }

    public void removeProduct(ProductDto dto){
        products.remove(dto);
    }  // 제거

    public ArrayList<ProductDto> getAllProducts(){return null;}

}
