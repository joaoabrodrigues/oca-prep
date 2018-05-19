package udemy.classdesign;

class Example {
    // 1 -> superclass
    // 2 -> static variables and initializers
    // 3 -> instance variables and initializers
    // 4 -> constructor
    private String name = "DogTest"; // 3
    {
        System.out.println(name);
    }

    private static int COUNT = 0; // 1

    static {
        System.out.println(COUNT); // 2
    }

    {
        COUNT += 10; // 4
        System.out.println(COUNT); // 5
    }

    public Example() {
        System.out.println("Constructor"); //8
    }
}

class Demo {

    static {
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new Demo();
    }

    {
        add(8);
    }
}

public class OrderOfInitialization {

    public static void main(String[] args) {
        new Example();
        new Demo();
    }
}
