package string;

public class TestString1 {
    public static void main(String[] args) {

        //problem 1
        System.out.println("문제1.");
        String url = "https://www.example.com";
        System.out.println(url.startsWith("https://"));

        //problem2
        System.out.println("\n문제2.");
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        for (String s : arr) {
            System.out.println(s + ":" + s.length());
        }

        //problem3
        System.out.println("\n문제3.");
        String str = "hello.txt";
        System.out.println("index = " + str.indexOf(".txt"));

        //problem4
        System.out.println("\n문제4.");
        System.out.println("filename = " + str.substring(0, 5));
        System.out.println("extName = " + str.substring(5));

        //problem5
        System.out.println("\n문제5.");
        str = "hello.txt";
        String ext = ".txt";
        int extIndex = str.indexOf(ext);
        System.out.println("filename = " + str.substring(0, extIndex));
        System.out.println("extName = " + str.substring(extIndex));

        //problem6
        System.out.println("\n문제6.");
        str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int index = str.indexOf(key);
        int count = 0;

        while(index != -1) {
            count++;
            index = str.indexOf(key, index+1);
        }

        System.out.println("count = " + count);
    }
}
