package udemy.classdesign;

import udemy.classdesign.testing.Cat;
import udemy.classdesign.testing.Rabbit;

// a class cannot implements two interfaces with the same method signature
// in this case, one interface must be extended another, cause an override will happen
public class DefaultInterfaceMethod {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();

        Cat cat = new Cat(2);
        System.out.println("cat speed = " + cat.getSpeed());
    }
}
