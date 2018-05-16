package udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingWrappersList {

    public static void main(String[] args) {
        // List<double> doubleList = new ArrayList<>(); -> primitives can't be used with lists
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(0.5); // -> looks primitive but, autoboxing happens
        doubleList.add(new Double(95.5)); // unnecessary boxing
        doubleList.remove(95.5); // autoboxing too

        double first = doubleList.get(0); // unboxing to primitive

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        System.out.println(numbers);

        // int number = numbers.get(0); -> NullPointerException primitives can't be null

        List<Integer> nums = new ArrayList<>();
        nums.add(1); // 0
        nums.add(2); // 1
        // pegadinha do malandro abaixo
        nums.remove(1); // remove number 2 at index 1
        nums.remove(new Integer(1)); // remove the object 1

        System.out.println(nums); // prints empty
    }
}
