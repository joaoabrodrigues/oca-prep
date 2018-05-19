package udemy.classdesign.testing;

public interface Herbivore {

    default void eatPlants(){
        System.out.println("Eating plants");
    }

    // public int getRequiredPlanAmount(){}
}
