package udemy.methods;

public class MethodReturnType {

    public void jump() {} // void return type

    public void jump2 () { // void return type
        return; // unnecessary
    }

    public String jump3() { return ""; } // returns an empty string

    // public String jump4() {} -> doesn't compile cause there is no return statement

    // public jump5(){} -> doesn't compile cause return type is required

    String jump6(int a){
        if (a == 5) {
            //return "";
        }
        return "abc";
    }

    int getInt() {
        return 9;
    }

    int getLong() {
        // return 9L; -> doesn't compile cause the type must be int
        return (int) 9L;
    }

    int expanded() {
        // int temp = 10; -> unnecessary
        // return temp;
        return 10;
    }

    boolean isTrue(){
        return 5 < 10; // we can use expressions as return statements
    }

    public void test(){}

    // public void 2test() {} -> methods can't start with numbers

    // public void void(){} -> methods can't use keywords for method names

    public void $test() {}

    public void _test() {}

    // public void() {} -> do not use keywords

}
