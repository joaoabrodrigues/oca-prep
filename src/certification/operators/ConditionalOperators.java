package certification.operators;

public class ConditionalOperators {

    // && and
    // || or
    // ^  exclusive or
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean d = a && b; // false
        boolean e = a || b; // true

        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int f = 4;
        boolean g = false && (f++ < 4); // (f++ < 4) is never executed (short-circuiting)
        // g = false
        // f = 4 -> keeps the value, cause f++ is never executed
        boolean h = (f-- == 4) && !g;
        // h = true
        // f = 3

        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
        // (true) && (true) || false
        // myInt = 3 -> keeps the value, cause (myInt++ == 4) is never executed
        // anotherInt = 3
        // myBoolean = true

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherInt);
        System.out.println("myBoolean = " + myBoolean);

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false); // z = false -> sets z to false

        System.out.println("x = " + x); // true
        System.out.println("y = " + y); // 20
        System.out.println("z = " + z); // false
    }
}
