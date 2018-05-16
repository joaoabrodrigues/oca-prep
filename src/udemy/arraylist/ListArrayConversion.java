package udemy.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Tony");
        names.add("José");

        Object[] namesArray = names.toArray(); // return array of objects
        System.out.println(namesArray.length);

        String[] stringArray = names.toArray(new String[0]); // must be an size at array

        String[] anotherStringArray = names.toArray(new String[names.size()]); // nicely

        String[] petsArray = {"dog", "cat", "parrot"};
        // Arrays.asList(petsArray);

        // same as the two above lines, but in just one
        // Arrays.asList("dog", "cat", "parrot"); // returns fixed size list
        List<String> petsList = Arrays.asList(petsArray);
        System.out.println(petsList.size());

        petsList.set(0, "bird"); // changes the list and the array
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "husky"; // changes the array and the list
        System.out.println(Arrays.toString(petsArray));

        // petsList.add("newDog"); -> UnsupportedOperationException cause Arrays.asList(array) returns an fixed size list

        // petsList.remove(0); -> UnsupportedOperationException cause Arrays.asList(array) returns an fixed size list

        List<String> list = Arrays.asList("one", "two", "three");
        list.add("four");//-> same as above modifications to list -> UnsupportedOperationException
    }
}
