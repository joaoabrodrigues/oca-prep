package certification.strings;

public class StringImmutability {

    public static void main(String[] args) {
        // when you create a string, there is no way to change it
        String hello = "hello";

        String hi = hello + "world"; // hi = "helloworld"
        hi = hello; // hi = "hello"

        System.out.println(hi + hello);// hellohello

        hello.toUpperCase();
        // to change -> hello = hello.toUpperCase();

        System.out.println(hello);// string is immutable

        // concat with method
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        String s3 = s2.concat("3");

        System.out.println(s1); // 1
        System.out.println(s2); // 12
        System.out.println(s3); // 123
    }
}

