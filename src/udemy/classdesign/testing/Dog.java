package udemy.classdesign.testing;

public abstract class Dog extends Animal implements HasTail, CanRun {

    public Dog(int age) {
        super(age);
        // compiler generates a call to super() here
        System.out.println("dog");
    }

    @Override // same name and the same parameters
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }

    @Override
    public int getTailLength() {
        return 5;
    }

    // OVERLOAD
    public void eat(String test){}

    @Override
    public double getAverageWeight() {
        // in this case super. is required, cause we are calling the parent method
        // without super. will call itself, causing an StackOverflowException
        return super.getAverageWeight() + 20;
    }


}
