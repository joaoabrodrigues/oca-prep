package I.java.basics;

public class VariableScopes {

    static int myGlobalInt = 5;

    public static void main(String[] args) {
        int myLocalInt = 10;

        {
            {
                int myOtherInt = 123;
                {
                    // compilation fails
                    // cause the scope of the previous block contains the scope
                    // of this block
                    // int myOtherInt = 124;
                    int myOtherInt2 = 321;
                }
            }
            int myOtherInt = 20;
            int anotherInt = 40;
            System.out.println("myOtherInt = " + myOtherInt);
            System.out.println("inCodeBlock myLocalInt = " + myLocalInt);
        }

        // compilation fails -> myOtherInt is out of the scope
        // System.out.println("myOtherInt = " + myOtherInt);
        System.out.println("myLocalInt = " + myLocalInt);
        System.out.println("myGlobalInt = " + myGlobalInt);

        // compilation fails
        // cause the myOtherInt does not exist in this scope
        // System.out.println("myOtherInt = " + myOtherInt);

        // there are no problems, cause the scope of myOtherInt is in the previous code block
        // so, in the main scope, the variable doesn't exists
        int myOtherInt = 30;
        int anotherInt = 50;
        System.out.println("myOtherLocalInt = " + myOtherInt);
        System.out.println("anotherInt = " + anotherInt);
    }

    public static void myMethod() {

    }
}
