package certification.strings;

public class UnderstandingEquality {

    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println(one == two); //false
        System.out.println(one == three); // true

        String x = "Java";
        String y = "Java";

        System.out.println(x == y); // true

        String a = "Java";
        String b = " Java".trim(); // returns a new string

        System.out.println(a == b); // false

        String c = "Java";
        String d = " Ja".trim() + "va"; // new instance of string

        System.out.println(c == d); // false
    }
}
