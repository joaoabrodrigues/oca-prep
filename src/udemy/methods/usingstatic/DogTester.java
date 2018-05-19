package udemy.methods.usingstatic;

public class DogTester {

    public static void main(String[] args) {
        Dog samoyed = new Dog();

        System.out.println(samoyed.count);
        System.out.println(Dog.count);

        Dog husky = new Dog();
        husky.incrementCounter();

        Dog.incrementCounter();

        System.out.println(Dog.count);

        samoyed = null;
        husky = null;

        System.out.println(Dog.count);
        System.out.println(samoyed.count); // static doesn't cause NPE
        System.out.println(husky.count);

        Dog.count = 10;
        Dog newDog = new Dog();
        Dog newDog2 = new Dog();
        newDog.count = 5;

        System.out.println(Dog.count);
        System.out.println(newDog.count);
        System.out.println(newDog2.count);

        newDog2.count = 11;

        System.out.println(Dog.count);
    }
}
