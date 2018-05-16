package udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods2 {

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();

        System.out.println(pets.isEmpty()); // check if the list is empty
        System.out.println(pets.size()); // returns how many elements are inside the list

        if (pets.isEmpty()) { // better than list == 0
            System.out.println("no pets");
        }

        if (pets.size() == 0) { // worst than isEmpty()
            System.out.println("no pets");
        }

        pets.add("cat");
        System.out.println(pets.isEmpty()); // false
        System.out.println(pets.size()); // 1

        pets.clear(); // remove all the elements from the list
        System.out.println(pets.isEmpty()); // true
        System.out.println(pets.size()); // 0

        pets.add("dog");
        System.out.println(pets.contains("cat")); // false
        System.out.println(pets.contains("dog")); // true

        // equals -> can be used to check equality between elements in one order
        List<String> newPets = new ArrayList<>();
        newPets.add("dog");

        System.out.println(pets.equals(newPets)); // true

        newPets.add("cat");

        System.out.println(pets.equals(newPets)); // false

        pets.add(0, "cat");
        System.out.println(pets);
        System.out.println(newPets);

        // size and elements are equal but order of elements is not equal
        System.out.println(pets.equals(newPets)); // false
    }
}
