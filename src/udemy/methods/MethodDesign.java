package udemy.methods;

public class MethodDesign {

    public void jump(){}

    // void public jump2(){} -> invalid order

    void jump3() {} // -> default access modifier (package private access)

    public final void jump4(){} // -> final is an optional specifier

    public static final void jump5(){} // -> static and final are optionals -> optional specifiers order does't matter

    public final static void jump6(){} // -> static and final are optionals -> optional specifiers order does't matter

    // public String void jump8(){} // -> the return type must be unique

    final public void jump9(){} // -> optional specifiers can be before access modifier

    static final public void jump10(){} // -> optional specifiers can be before access modifier
}
