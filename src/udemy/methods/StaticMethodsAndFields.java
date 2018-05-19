package udemy.methods;

public class StaticMethodsAndFields {

    public static int myNumber = 1;

    public static void main(String[] args) {
        System.out.println(myNumber);
    }
}

class StaticAnotherMain {

    public static void main(String[] args) {
        StaticMethodsAndFields.main(args);
        System.out.println("xablau");
        System.out.println(StaticMethodsAndFields.myNumber);
    }
}
