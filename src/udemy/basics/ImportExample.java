package udemy.basics;
// ALL IMPORTS ARE IN THE BEGINNING OF THE CLASS

import udemy.basics.testing.imports.classes.ExampleImportClass;
import udemy.basics.testing.imports.classes.ImportClass;

// import all classes from package;
// import udemy.basics.testing.imports.classes.*;

// import specific class from package;
import java.util.Random;

// import all classes from package;
// import java.util.*;

// redundant, cause java.lang is automatically imported
import java.lang.System;

public class ImportExample {

    public static void main(String args[]) {
        Random random = new Random();
        System.out.println(random.nextInt(5));

        // the literal "import" is an reserved word for java, we can't use
        // ImportClass import = new ImportClass();
        ImportClass importClass = new ImportClass();

        ExampleImportClass example = new ExampleImportClass();
    }

}
