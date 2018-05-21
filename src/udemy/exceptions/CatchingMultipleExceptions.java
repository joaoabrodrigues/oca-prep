package udemy.exceptions;

class MuseumClosed extends RuntimeException {}

class MuseumClosedForLunch extends MuseumClosed {}

public class CatchingMultipleExceptions {

    public static void main(String[] args) {
        try {
            visitMuseum();
        // } catch (RuntimeException e ) { // lines above will not compile cause this catch will handle all the above excpetions
        //    System.out.println("Runtime exception");
        } catch (MuseumClosedForLunch mc) { // subclass
            System.out.println("Closed for lunch come back in 2 hours");
        } catch (MuseumClosed mc) {
            System.out.println("Closed");
        }
        // doesn't compile if this comes after the parent class, cause first catch will handle both
        //catch (MuseumClosedForLunch mc) { // subclass -> doesn't compile if this comes after the parent class | first catch will handle both
        //  System.out.println("Closed for lunch come back in 2 hours");
        //}

        System.out.println(calculate());
    }

    public static String calculate() {
        String result = "";
        String str = null;
        try {
            try {
                result += "start"; // start
                str.length();
                result += "end";
            } catch (NullPointerException e) {
                result += "npe"; // startnpe
                throw new RuntimeException();
            }
            finally {
                result += "finally"; // startnpefinally
                throw new Exception();
            }
        } catch (Exception e) {
            result += "finished"; // startnpefinallyfinished
        }

        return result;
    }

    public static void visitMuseum(){
        boolean b = Math.random() < 0.5;

        if (b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();
    }
}
