package I.java.basics;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {
        // declare and initializing in two lines
        int myNumber;
        // compilation fails -> cause not have been initialized yet
        // System.out.println("myNumber = " + myNumber);
        myNumber = 10;
        System.out.println("myNumber = " + myNumber);

        // declare and initializing in one line
        double myDouble = 7.50;
        System.out.println("myDouble = " + myDouble);

        // multiple declaration with ,
        float myFloat1, myFloat2, myFloat3;

        // multiple declaration (,) with initialization
        float myFloat4 = 7.5f, myFloat5 = 8.12f;

        // multiple declaration with ;
        float myFloat6; float myFloat7;

        // multiple declaration (;) with initialization
        float myFloat8 = 5.152f; float myFloat9 = 24.15156f;

        // mixed
        float myFloat10 = 5f, myFloat11 = 125.5252f, myFloat12;

        boolean b1, b2;

        // compilation fails
        // multiple types in one line
        // double d1, double d2;

        int i1;
        int i2;
        // compilation fails
        // with ; become different statements
        // int i3; i4;

        // IDENTIFIERS -> letters, digits, dollar sign and underscore
        // $ we can use
        int $412;

        // _ we can use
        int _123;

        // illegal examples

        // do not use reserved keywords
        // int int = 10;
        // float double = 10f;
        // double public;

        // identifiers can't start with numbers
        // double 3double;

        // @ it is not a valid digit
        // double my@street;

        // * it is not a valid digit
        //float *$coffee;

    }
}
