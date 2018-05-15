package udemy.arrays;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 2};

        Arrays.sort(numbers);

        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(numbers));

        String[] strings = {"50", "9", "500"};
        // strings are sorted in alphabetical order, so
        // 9 > 500 > 50
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));
    }
}
