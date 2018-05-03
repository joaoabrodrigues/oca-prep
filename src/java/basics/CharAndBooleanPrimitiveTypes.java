package java.basics;

public class CharAndBooleanPrimitiveTypes {

    public static void main(String[] args) {
        char ch = 'a';

        // compilation fails -> there are too many characters in character literal
        // char ch = 'ab';

        char ch1 = '1';

        // upper case greek omega character
        char uniChar = '\u03A9';

        // roman 50 number
        char romanNumber = '\u216C';

        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumber = " + romanNumber);

        // true and false are reserved keywords
        boolean bool = true;
        boolean falseBool = false;

        System.out.println("bool = " + bool);
        System.out.println("falseBool = " + falseBool);
    }
}
