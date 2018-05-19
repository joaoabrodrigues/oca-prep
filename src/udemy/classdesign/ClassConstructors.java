package udemy.classdesign;

// CONSTRUCTOR RULES
// 1 - the first statement must be
//     this() -> that calls another constructor; or
//     super() -> that calls a parent constructor
// 2 - if super() is not declared, compiler will insert no argument super as the first statement
// 3 - super() call cant be used after the first statement
// 4 - compilation will fail if the parent class doesn't define a no-argument constructor and the child doesn't define any constructor
// 5 - if the parent does not have a no-argument constructor, the compiler requires an explicit call to a parent constructor in each child class
class Dog {

    private String color;

    public Dog(String color) { // constructor are used to initialize instance variables
        System.out.println("constructor");
        this.color = color; // "this" references the current class
    }

    // public dog(){} doesn't compile cause it's not a constructor
    public void Dog(){} // not a constructor cause has a return type

    public void printColor(){
        System.out.println("color = " + color); // in this case, "this" is not required
        // "this" is only required when a method has a same parameter name as the field parameter
    }
}

class Cat {
    private String color;
    private int height;
    private int length;

    public Cat (int length, int theHeight){
        //length = this.length;
        this.length = length;
        height = theHeight;
        color = "white";
    }

    public void printInfo(){
        // "this" here is optional
        System.out.println("cat length = " + this.length);
        System.out.println("cat height = " + height);
        System.out.println("cat color = " + color);
    }
}

public class ClassConstructors {

    public static void main(String[] args) {
        Dog dog = new Dog("black");
        dog.printColor();

        Cat cat = new Cat(10, 12);
        cat.printInfo();
    }
}
