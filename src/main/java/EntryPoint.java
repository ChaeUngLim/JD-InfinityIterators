import view.LoginMenu;

public class EntryPoint {
    private LoginMenu loginMenu;
    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint();
        entryPoint.loginMenu = new LoginMenu();
        entryPoint.loginMenu.showMenu();
    }
}
