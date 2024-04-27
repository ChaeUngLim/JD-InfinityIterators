package view;

public class MenuContext {
    private IMenuStrategy strategy;

    public void setStrategy(IMenuStrategy strategy) {
        this.strategy = strategy;
    }

    public void showMenu() {
        strategy.showMenu();
    }
}
