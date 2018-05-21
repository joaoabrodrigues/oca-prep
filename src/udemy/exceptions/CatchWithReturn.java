package udemy.exceptions;

public class CatchWithReturn {

    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static int calculate() {
        try {
            // System.exit(0); -> terminates the JVM, so no return is executed (only with this, finally will not be executed)
            return 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("error");
            // System.exit(0); -> terminates the JVM, so no return is executed (only with this, finally will not be executed)
            return 1;
        } finally { // finally always execute, so the method will return 0
            return 0;
        }
    }
}
