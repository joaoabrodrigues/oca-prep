package udemy.classdesign;

// OVERLOAD = same name method, different parameters
// OVERRIDE = same method, same parameters
class Dog2 {
    private String name;
    private String breed;
    private double weight;

    // constructor chaining
    public Dog2(String name){
        //this.name = name;
        //breed = "husky";
        //weight = 30.0;
        //Dog2(name, "husky"); -> doesn't compile
        // new Dog2(name, "husky"); -> compile but it is not what we want
        this(name, "husky");
        System.out.println("constructor 1");
        //  this(name, "husky"); -> "this" called as a method, calls another class constructor
        // this called as a constructor must be called as a first statement
    }

    public Dog2(String name, String breed) {
        //this.name = name;
        //this.breed = breed;
        //weight = 30.0;
        this(name, breed, 30.0);
        System.out.println("constructor 2");
    }

    public Dog2(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("weight = " + weight);
    }
}

public class OverloadingConstructors {

    public static void main(String[] args) {
        Dog2 dog1 = new Dog2("Maya");
        dog1.print();

        Dog2 dog2 = new Dog2("Coconut", "samoyed");
        dog2.print();

        Dog2 dog3 = new Dog2("Tyberius", "german shepard", 50.0);
        dog3.print();
    }
}
