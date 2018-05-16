package udemy.arraylist;

import java.util.*;

public class IteratingList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers at index " + i + " = " + numbers.get(i));
            // numbers.remove(2); -> IndexOutOfBoundsException
        }

        for (Integer number : numbers) {
            System.out.println("number = " + number);
            // numbers.remove(2); -> ConcurrentModificationException - we can't modify lists that we are iterating to
        }

        // Iterator class can be used to iterate the list and modify it at the same time
        // next()
        // hasNext()
        // remove()
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next(); // cursor that point between two elements
            System.out.println(number);
            iterator.remove();
        }

        System.out.println(numbers);

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        numbers.add(7);

        //hasNext -> iterate forward
        //hasPrevious -> iterate backward
        for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious();) {
            System.out.print(listIterator.previous() + " ");
            listIterator.remove();
        }

        System.out.println();

        System.out.println(numbers);
    }
}
