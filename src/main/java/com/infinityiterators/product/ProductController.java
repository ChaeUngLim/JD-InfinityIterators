package com.infinityiterators.product;

import java.util.ArrayList;

public class ProductController {
    public ProductController() {    // Constructor
        addSampleProduct();
    }

    private void addSampleProduct() {
        addNewProduct("T-shirt", 10000, "M", 10);
        addNewProduct("Shirt", 20000, "L", 20);
        addNewProduct("Pants", 30000, "XL", 30);
    }

    public void addNewProduct(String productName, double price, String size, int stock){
        // 올바른 값인지 체크
        if(productName == null || productName.isEmpty() || price <= 0 || size == null || size.isEmpty() || stock <= 0){
            throw new IllegalArgumentException("잘못된 값이 입력되었습니다.");
        }

        ProductDto product = new ProductDto(productName, price, size, stock);

        // 중복 상품 이름 체크
        boolean isDuplicated = new ProductService().checkDuplicateProductName(product);

        // 상품 등록
        if(isDuplicated) throw new IllegalArgumentException("중복된 상품 이름이 존재합니다.");

        new ProductService().addNewProduct(product);
    }

    public ProductDto searchProductByName(String name) {
        ProductDto dto = new ProductService().searchProductByName(name);
        if(dto == null) throw new IllegalArgumentException("해당 상품이 존재하지 않습니다.");
        return dto;
    }

//    public void modifyProductInfo(ProductDto dto){          // 수정
//        for (ProductDto products : getAllProducts()) {
//            if (products.getId() == dto.getId()){
//                products.setName(dto.getName());
//                products.setPrice(dto.getPrice());
//                products.setSize(dto.getSize());
//                products.setStock(dto.getStock());
//                break;
//            }
//        }
//    }

    public void removeProduct(ProductDto dto) {
        new ProductService().removeProduct(dto);
    }

    public ArrayList<ProductDto> getAllProducts() {
        return new ProductService().getAllProduct();
    }

}
