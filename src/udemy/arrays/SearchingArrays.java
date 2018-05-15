package udemy.arrays;

import java.util.Arrays;

public class SearchingArrays {

    // binary search method
    // 1 - element found (sorted array) -> returns index
    // 2 - element not found (sorted array) -> returns negative value,
    // with -1 that is where the element could be inserted and the sort
    // of the array won't be affected
    // 3 - unsorted array -> result not predictable/undefined
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7};

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 5));

        int[] notSortedNumbers = {5, 4, 10, 8, 6};

        System.out.println();

        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));

        Arrays.sort(notSortedNumbers);

        System.out.println(Arrays.toString(notSortedNumbers));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));
    }
}
