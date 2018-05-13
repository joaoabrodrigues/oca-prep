package certification.strings;

public class StringBuilderMethods {

    public static void main(String[] args) {
        // charAt, indexOf, length, substring
        // they do the same as string class
        // 0 1 2 3 4 5 6 7 8 9 10
        // p r o g r a m m i n g
        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
        int len = sb.length();
        char ch = sb.charAt(5);

        // sub = "gram"
        // len = 11
        // ch = 5
        System.out.println(sub + " " + len + " " + ch);

        // append
        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("-").append(true);

        System.out.println(b); // 1L-true

        // insert -> insert at specific index
        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "-"); // inserts in position 7
        builder.insert(2, 2); // inserts in position 2
        System.out.println(builder); //pr2ogram-ming

        // delete / deleteCharAt -> remove characters
        builder.delete(4, 9); // removes 4, 5, 6, 7, 8
        System.out.println(builder); //pr2oming
        builder.deleteCharAt(2);
        System.out.println(builder); //proming

        //builder.delete(2, 1); -> IndexOutOfBounds
        builder.delete(1, 1);// doesn't change anything
        System.out.println(builder);

        builder.delete(0, 100); // no errors
        System.out.println(builder);

        // reverse
        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse().reverse().reverse();
        System.out.println(sb1);

        // toString
        String myString = sb1.toString(); // convert StringBuilder to string
        myString = myString.toLowerCase();
        System.out.println(myString);

    }
}
