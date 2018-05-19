package udemy.methods.usingstatic;

public class Static {

    private String name = "Staic";

    public static void one(){}

    public static void two(){}

    public static void three(){
        one();
        two();
        // four(); -> can't call non static method inside static method
    }

    public void four(){
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();
        // four(); not static
        Static myStatic = new Static();
        myStatic.four();
        new Static().four();
    }
}
