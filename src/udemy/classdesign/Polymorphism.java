package udemy.classdesign;

import udemy.classdesign.testing.*;
import udemy.classdesign.testing.Cat;
import udemy.classdesign.testing.Dog;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

    public static void main(String[] args) {
        Samoyed samoyed = new Samoyed(5);
        samoyed.setName("Rex");

        // up the hierarchy we don't need cast
        // Samoyed > Dog > Animal
        Dog dog = samoyed; // another reference to Samoyed object in memory
        dog.printDetails();

        HasTail hasTail = samoyed;  // another reference
        System.out.println("tail length = " + hasTail.getTailLength());

        CanRun canRun = samoyed;  // another reference
        canRun.run(5);

        Animal animal = samoyed;  // another reference
        animal.printDetails();

        // down the hierarchy we need cast
        // Animal > Dog > Samoyed
        ((Samoyed) animal).printName();

        Object object = samoyed;  // another reference

        Animal cat = new Cat(2);
        Cat myCat = (Cat) cat;
        ((Cat) cat).getSpeed();
        myCat.getSpeed();

        // Bear bear = (Bear) "test"; -> not related in hierarchy
        // Dog newDog = (Dog)cat; -> it compiles but has a different hierarchy, causing an ClassCastException

        // bird is not polymorphic -> reference itself and object
        Bird bird = new Bird();
        Object birdObj = bird;

        // eagle is polymorphic -> 3 (eagle, bird n object) or more is polymorphic
        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;
        Object eagleObj = eagle;

        List<String> list = new ArrayList<>();

        // VIRTUAL METHOD -> only "visible" in runtime
        // during the compilation is an Animal
        // in runtime is a Rabbit
        Animal rabbit = new Rabbit();
        // calls the rabbit method
        rabbit.printDetails();
    }
}
