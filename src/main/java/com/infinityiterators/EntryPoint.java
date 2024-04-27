import view.LoginMenu;
import view.interaction.Interaction;

public class EntryPoint {
    private LoginMenu loginMenu;
    public static void main(String[] args) {
//        EntryPoint entryPoint = new EntryPoint();
//        entryPoint.loginMenu = new LoginMenu();
//        entryPoint.loginMenu.showMenu();

        String hiddenInput = Interaction.getHiddenInput("비밀번호를 입력해주세요: ");
        System.out.println(hiddenInput);
    }
}
