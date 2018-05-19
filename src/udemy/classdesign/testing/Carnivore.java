package udemy.classdesign.testing;

public interface Carnivore {

    default void eatMeat(){
        System.out.println("Eating meat");
    }
}
