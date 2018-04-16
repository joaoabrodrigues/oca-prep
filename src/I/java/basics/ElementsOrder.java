// compilation fails
// import must be after the package declaration
// import java.util.Random;

package I.java.basics;

import java.util.*;

// compilation fails
// unexpected token -> the package declaration must be the first statement of a class
// package test.package;

// compilation fails
// variables must not be outside of a class
// int myInt = 10;

// compilation fails
// methods must not be outside of a class
// public void myMethod() {}

// We can only have one public class in a java file
class MyOtherClass { }
// is public, should be declared in a file called AnotherClass.java
// public class AnotherClass { }

class AnotherClass { }

public class ElementsOrder {

    int myInt = 10;

    public static void main(String[] args) {
        int anotherInt = 20;

        // compilation fails
        // we can't declare a method inside a method
        // void myMethod() { }
    }

    void myMethod() { }

    // PIC
    // Package
    // Import
    // Class
}
