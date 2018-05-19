package udemy.methods;

import udemy.methods.common.Common;

public class UsingAccessModifiers {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        // common.defaultPrint(); -> is not public
        // common.protectedPrint();
        // common.privatePrint();
    }
}
