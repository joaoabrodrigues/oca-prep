package udemy.operators;

public class NumericPromotion {

    /********
     *
     * RULES
     *
     * 1) when two values have different data types, Java will auto promote
     *    one of the values to the larger data type
     * 2) when one of the values is integral and the other is floating-point,
     *    Java will auto promote the integral value to the floating-point
     *    value's data type
     * 3) small data types (byte, short and char), are first promoted to int
     *    any time they are used with binary arithmetic operator, even when
     *    neither of the operands is int
     * 4) After all promotion has finished and the operands are the same data
     *    type (e.g. all double), the result value will have the same data
     *    type as its promoted operands
     *
     *******/
    public static void main(String[] args) {
        //promotion is converting *smaller* to *bigger* type
        int x = 5;
        double y = 10.55;

        System.out.println("x + y = " + x + y); // concat
        System.out.println("x + y = " + (x + y)); // sum -> promoted to double

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = c + b + d; // promoted to double
        System.out.println("result = " + result);

        //cast is converting *bigger* to *smaller* type
        double myDouble = 5.55;
        //int myInt = 4 + myDouble;
        //compilation fails because 4 is promoted to double, so we are trying to assign double to int
        int myInt = 4 + (int)myDouble; //making cast, we lose precision (the decimal value)
        System.out.println("myInt = " + myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;
        //adding smaller and bigger, but assigning to bigger
        //byte byteResult = anotherInt + myByte;
        //compilation fails because myByte is promoted to int, so we are trying to assign int to byte
        byte byteResult = (byte) (anotherInt + myByte);

        System.out.println("intResult = " + intResult);
        System.out.println("byteResult = " + byteResult); // cause overflow
    }
}
