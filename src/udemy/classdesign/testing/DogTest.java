package udemy.classdesign.testing;

public class DogTest {

    public DogTest(String name){}

    private DogTest(){} // -> this is valid, but nobody is allowed to instantiate with this constructor
    // it used in static classes, to prevent an instantiation
}
