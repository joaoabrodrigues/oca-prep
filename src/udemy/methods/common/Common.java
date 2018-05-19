package udemy.methods.common;

public class Common {

    public int publicNumber = 1;
    protected int protectedNumber = 2;
    int defaultNumber = 3;
    private int privateNumber = 4;

    public void publicPrint(){
        System.out.println("public");
    }

    protected void protectedPrint(){
        System.out.println("protected");
    }

    void defaultPrint(){
        System.out.println("default");
    }

    private void privatePrint() {
        System.out.println("private");
    }

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        common.privatePrint();

        System.out.println(common.publicNumber);
        System.out.println(common.protectedNumber);
        System.out.println(common.defaultNumber);
        System.out.println(common.privateNumber);
    }
}
