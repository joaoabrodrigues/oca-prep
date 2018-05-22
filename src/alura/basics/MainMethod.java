package alura.basics;

public class MainMethod {

    //public static void main(String args[])
    //public static void main(String... args)
    //public static void main(String[] params)
    public static void main(String[] args){
        System.out.println("Método main");
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " => " + args[i]);
        }
    }
}
