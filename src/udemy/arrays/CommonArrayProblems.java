package udemy.arrays;

public class CommonArrayProblems {

    public static void main(String[] args) {
        // indexes start at 0
        int[] numbers = {1,2,3,4,5}; //5 elements -> index range 0-4
        for (int i = 1; i < numbers.length; i++){
            System.out.println(i + " - " + numbers[i]);
        }

        //the last index -> IndexOutOfBounds
        for (int i = 1; i <= numbers.length - 1; i++){ //must be -1
            System.out.println(i + " - " + numbers[i]);
        }

        //int[20] nums; -> array size only at initialization
        int[] nums = new int[20];

        //int size = numbers.length(); // doest compile, it is not a method
        int size = numbers.length;

        // can't change the array size
        //numbers.length = 10; -> only set the size in the initialization
    }
}
