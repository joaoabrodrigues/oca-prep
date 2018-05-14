package java.basics;

public class DefaultPrimitivesInitialization {

    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {
        // local variables need to be initialized to be used
        int localInt;

        // compilation fails
        // not have been initialized
        //System.out.println("localInt" + localInt);

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myChar = " + myChar);
    }
}
