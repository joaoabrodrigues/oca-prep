package udemy.methods;

import java.util.Arrays;

public class OverloadingMethods {

    public void walk(int miles){}

    public void walk(short miles){}

    public boolean walk(){
        return false;
    }

    void walk(int miles, short feet) {}

    public void walk(float miles) {}

    // public int walk(float miles) {} -> can't be the same name and the same arguments

    // public static void walk(float miles) {} -> can't be the same name and the same arguments, even static

    public void walk(int[] lengths){}
    // public void walk(int... lengths){} -> varargs are similar to array, so we can't declare two methods like these

    public static void main(String[] args) {
        Arrays.toString(new int[]{1, 2, 3, 4});
        Arrays.toString(new String[]{"1", "2", "3", "4"});

        run(1);
        run(2.0);
        run(Integer.valueOf(1));

        jump("test");
        jump(2);

        sum(1, 2);
        // int > long > Integer > varargs
        // if the sum method with int doesn't exist, it will call the long method
        // if the sum method with long doesn't exist, it will call the Integer method
        // if the sum method with Integer doesn't exist, it will call the varargs method

    }

    public static void run(int length){}
    public static void run(Integer length){}
    public static void run(double length){}

    public static void jump(String s) {
        System.out.printf("string");
    }

    public static void jump(Object o) {
        System.out.println("object");
    }

    public static int sum(int a, int b) {
        System.out.println("int num");
        return a + b;
    }

    public static long sum(long a, long b){
        System.out.println("long num");
        return a + b;
    }

    public static Integer sum(Integer a, Integer b) {
        System.out.println("Integer num");
        return a + b;
    }

    public static int sum(int... numbers){
        System.out.println("sum varargs");
        int sum = 0;

        for(int n : numbers){
            sum += n;
        }

        return sum;
    }
}
