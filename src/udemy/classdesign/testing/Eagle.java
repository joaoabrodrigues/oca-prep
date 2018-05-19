package udemy.classdesign.testing;

public class Eagle extends  Bird {

    // overload method
    public int fly(int height) {
        System.out.println("Eagle is flying at " + height + " meters");
        return height;
    }

    @Override
    public void eat(int amount) {
        super.eat(amount);
    }
}
