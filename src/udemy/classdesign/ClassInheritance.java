package udemy.classdesign;

import udemy.classdesign.testing.Dog;
import udemy.classdesign.testing.Samoyed;

public class ClassInheritance {

    public static void main(String[] args) {
        // animal
        // dog
        // samoyed
        Samoyed samoyed = new Samoyed(5);
        samoyed.printDetails();

        Dog dog = new Dog(2);
        dog.setName("Ty");
        dog.printDetails();

        samoyed.eat();
        System.out.println("avg = " + samoyed.getAverageWeight());
    }
}
