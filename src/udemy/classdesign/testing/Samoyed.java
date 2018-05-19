package udemy.classdesign.testing;

public class Samoyed extends Dog {

    public Samoyed(int age) {
        super(age); // -> calls the superclass constructor even we don't declare it here (ONLY WITH NO ARGUMENTS CONSTRUCTOR)
        System.out.println("samoyed");
    }

    @Override // can't override final and private methods
    public void eat() {
        // super.eat(); super call is optional in methods overrided and not necessarily must be at first
        System.out.println("Samoyed eating");
        super.eat();
    }
}
