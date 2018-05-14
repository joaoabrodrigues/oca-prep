package udemy.basics;

// Boxing -> put an primitive inside a wrapper (int to Integer)
// Unboxing -> (Integer to int)
// Autoboxing -> java compiler does an automatic conversion, declaring wrapper and assigning primitive
public class WrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;
        // boxing -> converting primitive to wrapper
        Integer myInteger = new Integer(10);
        Integer myInteger2 = 20;
        // boxing -> converting primitive to wrapper
        Integer myInteger3 = Integer.valueOf(30);
        Integer myInteger4 = Integer.valueOf("40");
        Integer myInteger5 = null;
        // compilation fails
        // incompatible types, only int can be assigned to an int
        // int myInt2 = null;

        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);
        System.out.println("myInteger5 = " + myInteger5);

        // unboxing
        // converting wrapper to primitive
        int myInt3 = myInteger3;

        // Autoboxing
        Integer myInteger7 = myInt;
        // Autoboxing
        Integer myInteger8 = 80;

        // Be careful, this will cause a NullPointerException
        // primitives can't contain null
        // int myInteger9 = myInteger5;

        // autoboxing
        printSum(1, 5);

        // not autoboxing
        printSum(myInteger, myInteger2);
    }

    private static void printSum(Integer first, Integer second) {
        System.out.println("sum = " + (first + second));
    }
}
