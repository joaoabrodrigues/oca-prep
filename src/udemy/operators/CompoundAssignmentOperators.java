package udemy.operators;

public class CompoundAssignmentOperators {

    // apply to both sides, left and right and store the result
    // in the variable on the left hand side
    public static void main(String[] args) {
        int x = 2;
        int z = 3;

        x = x * z; // simple assignment
        x *= z; // shorter form of x = x * z;

        System.out.println("x = " + x);

        // does't compile in the declaration
        // int a += 5;

        //without explicit cast
        long a = 10;
        int b = 4;
        // doesn't compile cause auto promote to long
        // b = b * a;
        // compile
        //b = (int) (b * a);
        b *= a;
        System.out.println("b = " + b);

        long c = 4;
        long d = (c=2); // shorter former of c = 2; long d = c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        long e = 3;
        long f = 2;
        long h = 1;

        long i = e + 3 * (f = 3) - (h -= 2);
        // 3 + 3 * 3 - (-1)
        // 3 + 9 + 1
        // 13

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
    }
}
