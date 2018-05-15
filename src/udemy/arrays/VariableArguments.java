package udemy.arrays;

import java.util.Arrays;

public class VariableArguments {

    // public static void main(String[] args) { }

    public static void main(String... xablau) { // also valid as a main method
        print(xablau);
        print("Java");
        print("this", "is", "my", "string", "array");
        print(new String[]{"xablau", "xablau2"}); // redundant creation cause we are using varargs
        print2(new String[]{"xablau", "xablau2"}); // not redundant cause print2 is expecting an array
        // print2("Java"); -> compilation error, expecting an array
        // print2("this", "is", "my", "string", "array"); -> compilation error, expecting an array
    }

    private static void print(String... xablau){
        // if the String... would be String[] the calls to print in the main method would not work
        System.out.println(Arrays.toString(xablau));
    }

    private static void print2(String[] xablau){
        System.out.println(Arrays.toString(xablau));
    }
}
