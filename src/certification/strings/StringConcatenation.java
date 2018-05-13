package certification.strings;

public class StringConcatenation {

    public static void main(String[] args) {
        String text = "Hello!";
        String anotherText = new String("Hello!");
        //redundant, we don't need to use the new operator

        System.out.println(2 + 3); // 5
        System.out.println("a" + "b");
        System.out.println(1 + 2 + "d");

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result = " + number + anotherNumber);
        System.out.println("result = " + (number + anotherNumber));

        String str = "";
        for (int i = 0; i < 10; i++)
            str += i + " "; //it's not a good practice, but is legal
        System.out.println(str);

        String hello = "Hello";
        String world = "world";
        // hello + world -> doest compile
        String helloWorld = hello + world;

        System.out.println(hello);
        System.out.println(helloWorld == hello + world); // false, comparing memory address
        System.out.println(helloWorld.equals(hello + world)); // true, comparing content

    }
}
