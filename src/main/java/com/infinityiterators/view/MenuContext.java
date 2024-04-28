package com.infinityiterators.view;

public class MenuContext {
    private IMenuStrategyByType strategy;

    public void setStrategy(IMenuStrategyByType strategy) {
        this.strategy = strategy;
    }

    public void showMenu() {
        strategy.showMenu();
    }
}
