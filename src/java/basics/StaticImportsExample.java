package java.basics;

//import static java.lang.Math.*;
import static java.lang.Math.PI;
import static java.lang.System.out;
import static testing.imports.statics.Config.MAX_COLUMN_COUNT;
import static testing.imports.statics.Config.NAME;
import static testing.imports.statics.Config.printConfig;

public class StaticImportsExample {

    public static void main(String[] args) {
        // without static import
        // int min = Math.min(5, 7);
        int min = Math.min(5, 7);
        System.out.println("min = " + min);
        out.println("PI = " + PI);

        printConfig();

        out.println("name = " + NAME);
        out.println("columnCount = " + MAX_COLUMN_COUNT);
    }
}