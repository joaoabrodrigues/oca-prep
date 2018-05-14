package udemy.operators;

public class ObjectEquality {

    // objects are compared using equals method while primitives are compared
    // using == operator
    // when using == on objects we are comparing object references (memory address)
    public static void main(String[] args) {
        // comparing objects
        Integer myInteger = 127;
        Integer myAnotherInteger = 127;

        System.out.println(myInteger == myAnotherInteger); // true cause we are comparing the int from the int pool

        System.out.println("128 == 128: " + (128 == 128));

        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));

        myInteger = 128;
        myAnotherInteger = 128;

        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));

        System.out.println("myInteger = " + myInteger);
        System.out.println("myAnotherInteger = " + myAnotherInteger);
        System.out.println(myInteger == myAnotherInteger); // false cause we are comparing objects

        //myInteger = 128;
        //Integer.valueOf(128);

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println("int1 == int2: " + (int1 == int2)); //false
        System.out.println("int1 == int3: " + (int1 == int3)); //false
        System.out.println("int2 == int3: " + (int2 == int3)); //false
        // int1 == int2
        // checking the memory address of the objects
        // is the same as System.identityHashCode(int1) == System.identityHashCode(int2)

        System.out.println("int1.equals(int2): " + int1.equals(int2)); // true
        System.out.println("int1.equals(int2): " + int1.equals(int3)); // true
        System.out.println("int1.equals(int2): " + int2.equals(int3)); // true
        // int1.equals(int2)
        // checking the data inside Integer value

        System.out.println("int1 hash = " + System.identityHashCode(int1));
        System.out.println("int2 hash = " + System.identityHashCode(int2));
        System.out.println("int3 hash = " + System.identityHashCode(int3));
    }
}
