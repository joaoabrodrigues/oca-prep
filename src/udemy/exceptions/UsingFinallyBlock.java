package udemy.exceptions;

public class UsingFinallyBlock {

    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "john";

        try {
            String element = firstToUppercase(array);
            System.out.println("element = " + element);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }

        // exam
        String str = "";
        try {
            // int result = 10 / 0; //bcd
            str += "a";
        } catch (Exception e) {
            str += "b";
        } finally {
            str += "c";
        }

        str += "d";
        System.out.println(str); // acd

    }

    public static String firstToUppercase(String[] array) {
        return array[0].toUpperCase();
    }
}
