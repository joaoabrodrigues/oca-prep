package udemy.classdesign;

import udemy.classdesign.testing.Animal;
import udemy.classdesign.testing.Cat;
import udemy.classdesign.testing.Rabbit;
import udemy.classdesign.testing.Samoyed;

public class PolyParameters {

    public static void main(String[] args) {
        Samoyed samoyed = new Samoyed(3);
        samoyed.setName("Maya");
        printDetails(samoyed);

        Rabbit rabbit = new Rabbit();
        rabbit.setName("Bunny");
        printDetails(rabbit);

        Cat cat = new Cat(2);
        cat.setName("Tom");
        printDetails(cat);

        Animal rex = createAnimal("Rex", 4);
        printDetails(rex);

        Animal kitty = createAnimal("Kitty", 3);
        printDetails(kitty);

        Animal bunny = createAnimal("Bunny", 2);
        printDetails(bunny);
    }

    public static void printDetails(Animal animal){
        animal.printDetails();
    }

    public static Animal createAnimal(String name, int age){
        if (name.equals("Rex")) {
            Animal animal = new Samoyed(age);
            animal.setName(name);
            return animal;
        } else if (name.equals("Kitty")) {
            Animal animal = new Cat(age);
            animal.setName(name);
            return animal;
        }

        Animal rabbit = new Rabbit(1);
        rabbit.setName(name);
        return rabbit;
    }

}
