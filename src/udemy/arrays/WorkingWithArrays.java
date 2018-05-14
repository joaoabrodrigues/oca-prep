package udemy.arrays;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int[] one = new int[3]; // empty array with 3 elements
        int[] two = new int[]{10,11,12}; // array with 3 elements

        // double[] a = new double[2.55]; -> only defines size with int
        double[] b = new double[4 * 5 / 2]; // creates empty array with 10 elements

        int x = 4;
        int y = 4;

        double[] c = new double[x * y];// creates empty array with 16 elements

        //anonymous array
        int[] three = {10, 11, 12};
        int[] four = {};

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];

        int[] ids, types; // creates two arrays
        int ids2[], types2; // ids2 -> array, types2 -> int; bad practice

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println(animals.equals(myAnimals)); // true -> reference
        System.out.println(animals == myAnimals); // true -> reference
        System.out.println(Arrays.equals(animals, myAnimals)); // true -> check the elements of the arrays

        System.out.println(animals.equals(otherAnimals)); // false -> reference
        System.out.println(animals == otherAnimals); // false -> reference
        System.out.println(Arrays.equals(animals, otherAnimals)); // true -> checking each element

        System.out.println(animals);
        System.out.println(animals.toString()); //[L -> represents a array

        System.out.println(Arrays.toString(animals));
    }

}