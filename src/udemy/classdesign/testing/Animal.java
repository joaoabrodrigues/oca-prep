package udemy.classdesign.testing;

public abstract class Animal {

    private int age;
    private String name;

    public Animal(){}

    public Animal(int age) {
        this.age = age;
        System.out.println("animal");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(getName() + " is eating");
    }

    public double getAverageWeight() {
        return 10.0;
    }

    protected abstract void printName();

    public void printDetails(){
        printName();
        System.out.println("age = " + age);
    }

    // public static abstract void run(); -> method can't be abstract and static at the same time

    // public abstract void run(){} abstract methods does not have body

    public abstract int getWeight();
}
