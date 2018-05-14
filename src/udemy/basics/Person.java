package udemy.basics;

/**
 * Class are basic building blocks that represents an object
 */
public class Person {

    /**
     * Variables or fields, that describes all the characteristics of the class.
     * They hold state of our application.
     *
     * When we define variables, we need to specify the type, like:
     * String, int, long, double, etc
     */
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Methods or functions
     * Are operations that we can call
     */

     /**
     * Methods can return values and the type must be declarated in the method signature
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Methods can receive values and the name and the type must be declarated in the method signature
     * Theses values are called parameters
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
