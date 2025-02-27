package wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        System.out.println("두 수의 합: " + sum(array));
    }

    static double sum(String[] array) {
        double result = 0d;
        for (String s : array) {
            result += Double.parseDouble(s);
        }
        return result;
    }
}
