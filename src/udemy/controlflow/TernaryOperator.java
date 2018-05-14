package udemy.controlflow;

public class TernaryOperator {

    public static void main(String[] args) {
        int x = 10;
        int y;

        if(x > 5)
            y = 2 * x;
        else
            y = 4 * x;

        System.out.println("y = " + y);

        // ternary operator
        //y = x > 5 ? 2 * x : 4 * x;
        y = (x > 5) ? (2 * x) : (4 * x);

        System.out.println("y = " + y);

        //not same data type example
        System.out.println(y > 5 ? 10 : "Test");
        // compilation error
        // int myInt = y > 5 ? 10 : "Test";

        int a = 1;
        int b = 1;
        int c = a < 10? a++ : b++;
        // a = 2
        // b = 1
        // c = 1
        System.out.println(a + ", " + b + ", " + c);

        int d = 1;
        int e = 2;
        int f = 3;

        if(d < 10) f = d++ < 1 ? e++ : f++;
        else f = (d + e) < 2 ? d++ : e++;
        // d = 2
        // e = 2
        // f = 3

        System.out.println(d + ", " + e + ", " + f);

        f = d > 20 ? 20 : d > 10 ? 10 : 0;
    }
}
