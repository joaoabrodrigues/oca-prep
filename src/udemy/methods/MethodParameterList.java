package udemy.methods;

public class MethodParameterList {

    int getZero() { // 0 arguments (niladic)
        return 0;
    }

    int increment(int number) { // 1 argument (monadic)
        return number++;
    }

    int sum(int a, int b) { // 2 arguments (dyadic)
        return a + b;
    }

    int plusMinus(int a, int b, int c) { // 3 arguments (triadic)
        return a + b - c;
    }

    double average(double a, double b, double c, double d){ // 4 arguments (polyadic)
        return (a + b + c + d) / 4;
    }

    // void test() -> doesn't compile we need brackets

    void test() {}

    // void test2(int a; int b){}  doesn't compile, parameter are separated by colon

    void test2(int a, int b){}

    /// void test2(int a); doesn't compile, missing method body
}
