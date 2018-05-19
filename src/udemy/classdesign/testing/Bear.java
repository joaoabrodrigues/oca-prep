package udemy.classdesign.testing;

public class Bear extends Animal implements Omnivore {

    @Override
    public void printName() {
        System.out.println("Bear name = " + getName());
    }

    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    public void eatMeat() {
        System.out.println(getName() + " eating meat");
    }

    @Override
    public void eatPlants() {
        System.out.println(getName() + " eating plants");
    }
}
