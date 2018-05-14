package udemy.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        //*************************
        // ARITHMETIC OPERATORS
        //*************************
        int result = 3 - 2 + 2 * 2 + 3;
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3
        // 8
        System.out.println("result = " + result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 8 + 10
        // 3 - 8 + 10
        // -5 + 10
        // 5
        System.out.println("result = " + result);

        //*************************
        // UNARY OPERATORS
        //*************************
        int a = 4;
        int b = 3 - 2 * --a; // decrement first, then use the variable
        // 3 - 2 * 3
        // 3 - 6
        // -3
        //--a means that first reduce by one and then use the variable

        System.out.println("a = " + a + ", b = " + b);

        a = 4;
        b = 3 - 2 * a--; //use the variable first, then decrement
        // 3 - 2 * 4
        // 3 - 8
        // -5
        //a-- means that first use the variable and then reduce by one
        System.out.println("a = " + a + ", b = " + b);

        long c = 2;
        long d = 4 + 3 * c++;
        // 4 + 3 * 2
        // 4 + 6
        // 10
        //c++ means that first use the variable and then reduce by one
        System.out.println("c = " + c + ", d = " + d);

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        // 10 - 3 * 3 - 4 / 4
        // 10 - 3 * 3 - 1
        // 10 - 9 - 1
        // 0
        System.out.println("result = " + result);

        //*************************
        // MODULUS/REMAINDER OPERATOR
        //*************************
        int i = 10;
        int j = 3;

        int k = i % j;
        // 10%3 == 10/3=3 -> 3*3=9 -> 10-9=1
        int m = 10 % 2;
        // 10%2 == 10/2=5 -> 5*2=10 -> 10-10=0
        System.out.println("k = " + k + ", m = " + m);

        int f = 12;
        int g = 5;
        int h = 2;

        int n = f / 2 - 10 %(4+3) - 2 * f%g - h * 3;
        // 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
        // 6 - 3 - 24 % 5 - 6
        // 3 - 4 - 6
        // -7
        System.out.println("n = " + n);
    }
}
