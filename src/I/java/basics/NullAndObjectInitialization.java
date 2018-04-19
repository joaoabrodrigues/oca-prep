package I.java.basics;

public class NullAndObjectInitialization {

    static Object myObject = new Object();
    // reduntant, cause any object in java without initialization is null
    static Object myOtherObject = null;

    static String myString;

    public static void main(String[] args) {
        Object myLocalObject = new Object();
        Object anotherObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject = " + myObject);
        System.out.println("myOtherObject = " + myOtherObject);

        System.out.println("myLocalObject = " + myLocalObject);
        // compilation fails, cause it isn't initialized
        // System.out.println("anotherObject = " + anotherObject);

        System.out.println("name = " + name);
        System.out.println("anotherName = " + anotherName);

        System.out.println("myString = " + myString);

        //myString = "JAVA";

        // NullPointerException
        // myString, by default, is null
        myString.toLowerCase();
        System.out.println("myString = " + myString);
    }
}
