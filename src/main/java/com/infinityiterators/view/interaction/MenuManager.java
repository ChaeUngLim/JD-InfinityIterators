package com.infinityiterators.view.interaction;

public class MenuManager {
    public static void displayMenuHeader(String header) {
        // ========== MENUNAME ==========
        // 메뉴 길이에 따라 = 의 개수가 달라지도록 하여 총 좌우 길이를 50으로 맞춤
        // 메뉴명이 한글일 경우 한글 1자가 2자로 인식되는 문제를 해결하기 위해
        // 메뉴명의 길이를 2로 나눈 값을 기준으로 좌우에 =를 배치
        // 메뉴명이 홀수일 경우 좌측에 한 칸 더 배치
        final int MENU_LENGTH = 50; // 메뉴명을 포함한 전체 메뉴 길이(고정값)

        int menuNameLength = header.length();
        int leftLength = (MENU_LENGTH - menuNameLength) / 2;
        int rightLength = MENU_LENGTH - menuNameLength - leftLength;
//        System.out.println("=".repeat(leftLength) + " " + header + " " + "=".repeat(rightLength));
        String format = "=".repeat(leftLength) + " " + header + " " + "=".repeat(rightLength);
        Interaction.displayMessage(format, DisplayType.MENU, true);
    }

    public static void displaySelectionMenu(String... selections) {
        for (int i = 0; i < selections.length; i++) {
            String format = (i + 1) + ". " + selections[i];
            Interaction.displayMessage(format, DisplayType.MENU, true);
        }
    }
}
