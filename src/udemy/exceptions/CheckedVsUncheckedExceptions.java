package udemy.exceptions;

public class CheckedVsUncheckedExceptions {

    public static void main(String[] args) {
        //myMethod(); // -> checked / doest compile cause we need to handle or declare that this method throws and checked exception
        anotherMethod(); // -> unchecked / compile
    }

    public static void myMethod() throws Exception {
        throw new Exception("FAIÔ");
    }

    public static void anotherMethod() { // throws is optional
        throw new RuntimeException("FAIÔ DE NOVO");
    }
}
