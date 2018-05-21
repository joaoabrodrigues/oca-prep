package udemy.exceptions;

public class DealingWithExceptions {

    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("Error dividing. Message = " + e.getMessage());
        }
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
