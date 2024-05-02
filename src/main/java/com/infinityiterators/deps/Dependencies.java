package com.infinityiterators.deps;

import com.infinityiterators.Account.AccountController;
import com.infinityiterators.order.OrderController;
import com.infinityiterators.product.ProductController;

public class Dependencies {
    private AccountController accountController;
    private ProductController productController;
    private OrderController orderController;

    public Dependencies() {
        accountController = new AccountController();
        productController = new ProductController();
        orderController = new OrderController();
    }

    // only use controller modules
    public AccountController accountController() {
        return accountController;
    }

    public ProductController productController() {
        return productController;
    }

    public OrderController orderController() {
        return orderController;
    }
}
