package I.java.basics;

public class DecimalNumericPrimitiveTypes {

    public static void main(String[] args) {
        // compilation fails
        // any decimal with no letters, java understands as double
        // float myNumber = 25.4;

        float myNumber = 25.4f;

        // illegal underscore -> compilation fails
        // double before  10_.55;

        // illegal underscore -> compilation fails
        // double after = 10._55;

        // illegal underscore -> compilation fails
        // double first = _10.55;

        // illegal underscore -> compilation fails
        // double last = 10.55_;

        double myDouble = 2.54;

        // automatically converted to double
        double myDouble2 = 2.54f;

        // don't need to specify, cause every decimal is a double
        double anotherDouble = 2.45d;

        // E03 = the number of how many decimal places do we move our dot
        double scientific = 5.000125E3;
        double scientific2 = 5.000125E03; // the same as the previous
        double myDouble3 = 5000.125; // the same as the previous

        System.out.println("scientific = " + scientific);
        System.out.println("scientific2 = " + scientific2);
        System.out.println("myDouble3 = " + myDouble3);

        // p indicates hexadecimal floating point number
        double hexPi = 0x1.91eb851eb851fp1;
        System.out.println("hexPi = " + hexPi);
    }
}
