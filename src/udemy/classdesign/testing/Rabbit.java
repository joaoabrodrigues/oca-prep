package udemy.classdesign.testing;

public class Rabbit extends Animal {

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
}
