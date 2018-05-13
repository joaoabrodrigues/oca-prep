package certification.operators;

public class AssignmentOperators {

    // ASSIGNMENT OPERATOR
    // is the operator that modifies or assign the variable on the left hand side
    // of the operator with result on the right hand side
    public static void main(String[] args) {
        // doesn't compile
        // double to int
        //int x = 1.0;
        // int to short
        //short y = 19812345;
        // float to int
        //int z = 9f;
        // integer too big
        //long f = 1234567894123415649;

        int x = (int) 1.0;
        short y = (short) 19812345;
        int z = (int) 9f;
        long t = 1234567894123415649L;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);

        // overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        //myByte = myByte + 1;
        myByte++;

        //mySecondByte = mySecondByte - 1;
        mySecondByte--;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        short a = 10;
        short b = 20;
        // java auto promote all small values to int
        short c = (short) (a * b);
        System.out.println("c = " + c);
    }
}
