package udemy.methods;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

    private static final int SIZE; // if the static final variable is not initialized in its declaration, it must be declared at the static initialization

    private static int one;
    private static final int two;
    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();
    // private static final int four;

    static { // static init
        System.out.println("first static init");
        int rows = 5;
        int columns = 4;
        SIZE = rows * columns;
    }

    static {
        System.out.println("second static init");
        one = 1; // isn't final, we can assign
        two = 2;
        one = three;
        // three = 3; -> can't assign cause it's final
        one = 2;
        one = three;
    }

    static {
        System.out.println("third static init");
        NAMES.add("JIMMY");
        NAMES.add("Timmy");
    }

    public static void main(String[] args) {
        System.out.println(NAMES);
    }
}
