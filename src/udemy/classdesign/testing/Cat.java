package udemy.classdesign.testing;

public class Cat extends Animal implements Run {

    public Cat(int age){
        super(age);
    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    public void printName() {}

    @Override
    public int getSpeed() {
        return 15;
    }
}
