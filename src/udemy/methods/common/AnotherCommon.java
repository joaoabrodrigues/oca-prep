package udemy.methods.common;

public class AnotherCommon {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        // common.privatePrint(); -> doesn't compile, it invisible from here with "private" access modifier

        System.out.println(common.publicNumber);
        System.out.println(common.protectedNumber);
        System.out.println(common.defaultNumber);
        //System.out.println(common.privateNumber); -> doesn't compile, it invisible from here with "private" access modifier
    }
}
