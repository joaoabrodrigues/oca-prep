package certification.operators;

public class UnaryOperators {
    /**
     *  +  -> literal number is positive
     *  -  -> literal number is negative
     *  ++ -> increment by 1
     *  -- -> decrement by 1
     *  !  -> inverts a boolean logical value
     */
    public static void main(String[] args) {
        partOne();
        partTwo();
    }

    private static void partOne(){
        // + unary operator
        /// redundant
        int x = +3;
        System.out.println("x = " + x);

        // - unary operator
        double y = -x;
        System.out.println("x = " + x + ", y = " + y);

        y = -y;//3
        System.out.println("x = " + x + ", y = " + y);

        boolean a = true;
        boolean b = !a;
        System.out.println("a = " + a + ", b = " + b);

        b = !b;//true
        System.out.println("a = " + a + ", b = " + b);

        //int myInt = !5;
        //doest compile

        //boolean myBoolean = -true;
        //doest compile

        //boolean z = 10;
        //doest compile
    }

    private static void partTwo(){
        //ATTENTION
        //increment and decrement have higher order than +, -, *, /, ...

        int myInt = 5;
        int otherInt = ++myInt; // both 6
        System.out.println("myInt = " + myInt + ", otherInt = " + otherInt);

        int newInt = 5;
        int newOtherInt = newInt++; // 6 and 5
        System.out.println("newInt = " + newInt + ", newOtherInt = " + newOtherInt);

        int count = 0;
        System.out.println("count = " + count); // 0
        System.out.println("count = " + ++count); // 1
        System.out.println("count = " + count); // 1
        System.out.println("count = " + count++); // 1
        System.out.println("count = " + count); // 2
        System.out.println("count = " + --count); // 1
        System.out.println("count = " + count--); // 1
        System.out.println("count = " + count); // 0

        //exam questions
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // 4 * 5 / 4 + 2
        // 20 / 4 + 2
        // 5 + 2
        // 7
        System.out.println("e = " + e + ", f = " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // 3 + 5 * 3 + 2 * g++ - h-- % --g -> h = 3, g = 5
        // 3 + 5 * 3 + 2 * 5 - 3 % --g -> h = 2, g = 6
        // 3 + 5 * 3 + 2 * 5 - 3 % 5
        // 3 + 15 + 10 - 3
        // 18 + 7
        // 25
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
    }
}
