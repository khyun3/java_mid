package wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        //String str 을 Integer 로 변환해서 출력해라.
        Integer referenceInt = Integer.parseInt(str);
        System.out.println("referenceInt =" + referenceInt);

        //오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.
        //Integer 를 int 로 변환해서 출력해라.
        int unboxedValue = referenceInt;
        System.out.println("unboxedInt = " + unboxedValue);

        //int 를 Integer 로 변환해서 출력해라.
        Integer boxedInt = unboxedValue;
        System.out.println("boxedInt = " + boxedInt);
    }
}
