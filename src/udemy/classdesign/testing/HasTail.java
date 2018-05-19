package udemy.classdesign.testing;

public interface HasTail {

    // public static final int DEFAULT_TAIL_LENGTH = 2; -> redundant
    int DEFAULT_TAIL_LENGTH = 2;

    int getTailLength();

    // int getWeight(){} -> same as abstract, can't have method body
}
