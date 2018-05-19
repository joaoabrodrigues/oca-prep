package udemy.classdesign.testing;

public class Rabbit extends Animal implements Herbivore, Hop {

    public Rabbit(){
        // super; -> does not compile, it is not a statement
        // super().setAge(3);
        super();

        super.setAge(3); // same below
        this.setAge(3); // same above
    }

    public Rabbit(int age) {
        // this(age); -> does not compile, recursive call
        // super();
        // this();
        super(3);
        setAge(3);
    }

    @Override
    public void printDetails() {
        System.out.println("Rabbit average jump height is " + Hop.getAverageJumpHeight());
    }

    @Override
    public int getWeight() {
        return 1;
    }

    @Override
    public void printName() {}

}
