package udemy.classdesign.testing;

public class Snake extends Reptile {

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    // in Reptile class it is protected, in child classes we can
    // give to the override method a higher access modifier but we can't
    // give a lower access modifier as private
    public double getWeight() {
        return 10.0;
    }
}
