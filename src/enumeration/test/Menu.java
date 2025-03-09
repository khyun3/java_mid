package enumeration.test;

public class Menu {
    private AuthGrade authGrade;

    public void printGradeSelectionMessage() {
        System.out.print("당신의 등급을 입력하세요");
        String grade = "[";
        for (AuthGrade value : AuthGrade.values()) {
            grade = grade.concat(value.name()).concat(", ");
        }
        System.out.print(grade.substring(0, grade.length() - 2) + "]: ");
    }

    public void setGradeFromInput(String input) {
        authGrade = AuthGrade.valueOf(input);
        System.out.println("당신의 등급은 " + authGrade.getDescription()+ "입니다.");
    }

    public void printMenuList() {
        String menus = "==메뉴 목록==\n";
        switch (authGrade) {
            case GUEST:
                menus = menus.concat("- 메인 화면\n");
                break;
            case LOGIN:
                menus = menus.concat("- 메인 화면\n");
                menus = menus.concat("- 이메일 관리 화면\n");
                break;
            case ADMIN:
                menus = menus.concat("- 메인 화면\n");
                menus = menus.concat("- 이메일 관리 화면\n");
                menus = menus.concat("- 관리자 화면\n");
                break;
        }
        System.out.print(menus);
    }
}
