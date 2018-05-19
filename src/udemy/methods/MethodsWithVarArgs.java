package udemy.methods;

import java.util.Arrays;

public class MethodsWithVarArgs {

    public void jump1(int... numbers){}

    public void jump2(int start, int... numbers){}

    // public void jump3(int... numbers, int start) {} -> varargs must be the last in the parameter list

    // public void jump4(int... numbers, int... numbers2){} -> varargs must be just one parameter

    public static void main(String[] args) {
        jump(1);
        jump(1, 3);
        jump(4, 4, 5, 6);
        jump(1, new int[]{4, 5, 6}); // redundant array creation
        //jump(1, null); // NullPointerException

        run();
        run(11, 22, 33, 44, 55, 66, 77, 88, 99);
    }

    public static void jump(int start, int... numbers){
        System.out.println("start = " + start + " numbers.length = " + numbers.length);
    }

    public static void run(int... numbers){
        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        System.out.println(Arrays.toString(numbers));
    }
}
