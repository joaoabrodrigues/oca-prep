package udemy.classdesign;

import udemy.classdesign.testing.Animal;
import udemy.classdesign.testing.Samoyed;

public class AbstractClasses {

    public static void main(String[] args) {
        // Animal animal = new Animal(); -> animal is abstract, can't be instantiate

        Samoyed samoyed = new Samoyed(5);
        samoyed.setName("Rex");
        samoyed.printDetails();
        samoyed.setAge(5);
        samoyed.printName();
        samoyed.printDetails();
        System.out.println("weight = " + samoyed.getWeight());

    }
}
