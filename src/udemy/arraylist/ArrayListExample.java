package udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // dynamic array, it automatically resized as need
        // inside, use simple arrays
        ArrayList myList = new ArrayList(); // its an array of object if we don't declare an explicit type
        ArrayList<Object> newArrayList = new ArrayList<Object>(); // same of the above

        // only strings
        ArrayList<String> list = new ArrayList<>(); // -> since java 5, we don't need to specify the type on the right diamond operator
        List<String> list2 = new ArrayList<>(); // list is an interface that is implemented by arrayList

        // ArrayList<String> list3 = new List<>(); -> doest compile, you can't declare a class and instantiate an interface

        List<String> list3 = new ArrayList<>(20); // initialCapacity

    }
}
