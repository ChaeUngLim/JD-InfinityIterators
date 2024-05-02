package com.infinityiterators.view.admin.product;

import com.infinityiterators.deps.Dependencies;
import com.infinityiterators.product.*;
import com.infinityiterators.view.*;
import com.infinityiterators.view.interaction.*;

import java.util.ArrayList;

public class AdminProductMenu implements ISubMenuEntryPoint {
    private Dependencies di;
    public AdminProductMenu(Dependencies di) {
        this.di = di;
    }

    @Override
    public void showEntryPointMenu() {
        while(true) {
            Interaction.clearScreen();

            MenuManager.displayMenuHeader("관리자 상품 관리 메뉴");
            MenuManager.displaySelectionMenu("등록된 상품 목록 조회", "새 상품 등록", "상품 정보 수정", "등록된 상품 삭제", "뒤로 가기");

            int selection = Interaction.getInt("메뉴를 선택해주세요");

            switch(selection) {
                case 1:
                    showProductList();
                    Interaction.getInt("메뉴로 돌아가려면 아무 키나 누르세요.");
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    Interaction.displayMessage("현재는 지원되지 않는 기능입니다.", DisplayType.ERROR, true);
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    Interaction.displayMessage("뒤로 가기", DisplayType.SYSTEM, true);
                    return;
                default:
                    Interaction.displayMessage("잘못된 입력입니다.", DisplayType.ERROR, true);
                    break;
            }
        }
    }
    private void removeProduct() {
        showProductList();

        int id = Interaction.getInt("삭제할 상품 ID를 입력해주세요");
        ProductDto product = di.productController().searchProductByName(""); // TODO. searchProductById 메소드로 수정
//        ProductDto product = new ProductController().searchProductById(id);

        // 상품이 존재하지 않을 경우
        if(product == null) {
            Interaction.displayMessage("해당 상품이 존재하지 않습니다.", DisplayType.ERROR, true);
            return;
        }

        di.productController().removeProduct(product);
        Interaction.displayMessage("상품이 삭제되었습니다.", DisplayType.SYSTEM, true);
    }


    private void addNewProduct() {
//        Interaction.clearScreen();
//        MenuManager.displayMenuHeader("새 상품 등록");
//
//        String name = Interaction.getString("상품명을 입력해주세요");
////        double price = Interaction.getDouble("가격을 입력해주세요");
//        String size = Interaction.getString("사이즈를 입력해주세요");
//        int stock = Interaction.getInt("재고수량을 입력해주세요");
//
//        try {
//            new ProductController().addNewProduct(name, price, size, stock);
//            Interaction.displayMessage("상품이 등록되었습니다.", DisplayType.SYSTEM, true);
//        } catch(IllegalArgumentException e) {
//            Interaction.displayMessage(e.getMessage(), DisplayType.ERROR, true);
//        }
    }

    private void showProductList() {
        Interaction.clearScreen();
        MenuManager.displayMenuHeader("상품 목록");

        ArrayList<ProductDto> allProducts = di.productController().getAllProducts();
        if(allProducts.size() == 0) {
            Interaction.displayMessage("등록된 상품이 없습니다.", DisplayType.ERROR, true);
            return;
        }

        Interaction.displayMessage("상품 ID\t\t상품명\t\t가격\t\t사이즈\t\t재고수량", DisplayType.SYSTEM, true);
        for(ProductDto product : allProducts) {
            Interaction.displayMessage(product.getId() + "\t\t" + product.getName() + "\t\t" + product.getPrice() + "\t\t" + product.getSize() + "\t\t" + product.getStock(), DisplayType.SYSTEM, true);
        }
    }
}
