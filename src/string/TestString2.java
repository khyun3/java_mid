package string;

public class TestString2 {
    public static void main(String[] args) {
        //problem7
        System.out.println("문제 7.");
        String original = "          Hello Java    ";
        System.out.println(original.strip());


        //problem8
        System.out.println("\n문제 8.");
        String input = "hello java spring jpa java";
        System.out.println(input.replace("java", "jvm"));

        //problem9
        System.out.println("\n문제 9.");
        String email = "hello@example.com";
        String[] tokens = email.split("@");
        System.out.println("ID : " + tokens[0]);
        System.out.println("Domain : " + tokens[1]);

        //problem10
        System.out.println("\n문제 10.");
        String fruits = "apple,banana,mango";
        String[] fruitTokens = fruits.split(",");
        for (String fruit : fruitTokens) {
            System.out.println(fruit);
        }
        System.out.println("joinedString = " + String.join("->", fruitTokens));

        //problem11
        System.out.println("\n문제 11.");
        String str = "Hello Java";
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(str).reverse());

    }
}
