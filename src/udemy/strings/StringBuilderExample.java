package udemy.strings;

public class StringBuilderExample {

    public static void main(String[] args) {
        String myString = "";

        for(char c = 'a'; c <= 'z'; c++)
            myString += c; // every iteration this will create new string object

        System.out.println(myString);

        // with string builder
        StringBuilder sb = new StringBuilder();//create new instance of StringBuilder object

        for(char c = 'a'; c <= 'z'; c++)
            sb.append(c); // add char to string builder, reuses string builder without creating string ecah time

        System.out.println(sb);

        //
        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); // start-middle

        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println(builder);
        System.out.println(anotherBuilder);
        System.out.println(builder == anotherBuilder);
        System.out.println("builder hash -> " + System.identityHashCode(builder));
        System.out.println("anotherBuilder hash -> " + System.identityHashCode(anotherBuilder));

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        myBuilder.append("MyNewTest");
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java "); // will be the same reference -> same object -> same value
        b = b.append("is").append(" so ").append("Cool");

        System.out.println(a); // This Java is so Cool
        System.out.println(b); // This Java is so Cool

    }
}