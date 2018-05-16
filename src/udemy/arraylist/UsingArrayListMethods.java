package udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods {

    public static void main(String[] args) {
        //List list = new ArrayList(); // same as below
        List<Object> list = new ArrayList<>();
        list.add("dog");
        list.add(5);

        System.out.println(list); // calls toString method automatically

        List<String> pets = new ArrayList<>();
        pets.add("dog");

        System.out.println(pets);

        pets.add(0, "cat");

        System.out.println(pets);

        // pets.add(5); -> incompatible types
        // pets.add(12, "shark"); -> IndexOutOfBounds

        // cat, dog
        pets.add(1, "parrot");
        // cat, parrot, dog
        pets.add(3, "penguin");
        // cat, parrot, dog, penguin
        pets.add(0, "bird");
        // bird, cat, parrot, dog, penguin

        System.out.println(pets);

        // REMOVE METHOD
        // remove the first match object or specific position object
        pets.remove("parrot");
        // bird, cat, dog, penguin

        System.out.println(pets);

        pets.remove(2);
        // bird, cat, penguin

        System.out.println(pets);

        // SET METHOD
        // change the specific object without modify the size of the array
        pets.set(0, "newBird"); // -> pets[0] = "newBird";
        // newBird, cat, penguin

        System.out.println(pets);

        // pets.set(3, "shark"); IndexOutOfBoundsException -> size: 3, indexRange: 0-2
    }
}
