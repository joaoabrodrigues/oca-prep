package udemy.classdesign;

public class ThisStatement {

    private String firstName;
    private String lastName;

    public ThisStatement(){
        this("Rric", "Johnson");
    }

    public ThisStatement(String firstName, String last){
        // this(): -> recursive constructor call
        this.firstName = firstName;
        //this.lastName = last;
        lastName = last;
    }

    public void setFirstName(String firstName){
        // this(); -> only call this() in constructors
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getFullName(){
        // return this.firstName + this.lastName;
        return firstName + lastName;
    }
}
