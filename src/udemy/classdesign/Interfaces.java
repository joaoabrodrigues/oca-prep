package udemy.classdesign;

import udemy.classdesign.testing.Bear;
import udemy.classdesign.testing.Samoyed;

public class Interfaces {

    public static void main(String[] args) {
        Samoyed sam = new Samoyed(2);
        sam.setName("Twincy");
        System.out.println("tail length = " + sam.getTailLength());
        sam.run(10);

        System.out.println();

        Bear bear = new Bear();
        bear.setAge(10);
        bear.setName("Yogi Bear");
        bear.eat();
        bear.eatMeat();
        bear.eatPlants();
    }
}
