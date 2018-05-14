package udemy.operators;

public class EqualityOperators {

    // == equals
    // != not equals
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        boolean c = a == b; // false
        boolean d = a != b; // true

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // does not compile cause we are comparing boolean with number
        // boolean g = true == 0;
        // does not compile cause we are comparing boolean with string
        // boolean h = false != "test";

        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false); // false

        System.out.println("x = " + x); // false
        System.out.println("y = " + y); // true
        System.out.println("z = " + z); // false
    }
}
