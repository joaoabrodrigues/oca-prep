package udemy.classdesign;

import udemy.classdesign.testing.DogTest;

public class DefaultConstructor {

    public static void main(String[] args) {
        // default constructor gets generated only when there is no another constructor methods
        // DogTest dogTest = new DogTest(); // default constructor with no argument
        DogTest dogTest = new DogTest("Rex");
    }
}
