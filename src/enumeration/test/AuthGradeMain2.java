package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.printGradeSelectionMessage();
        menu.setGradeFromInput(sc.nextLine());
        menu.printMenuList();
    }
}

