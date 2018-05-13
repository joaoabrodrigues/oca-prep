package certification.strings;

public class StringMethods {

    public static void main(String[] args) {
        //partOne();
        partTwo();
    }

    private static void partOne() {
        // 0 1 2 3 4 5 6 7 8 9 10
        // j a v a   i s   f u n
        String str = "java is fun";

        // length
        System.out.println("length = " + str.length());

        // charAt -> query the string to find the character at specific position
        System.out.println(str.charAt(0)); // j
        System.out.println(str.charAt(2)); // v
        System.out.println(str.charAt(6)); // s
        System.out.println(str.charAt(10)); // n
        //System.out.println(str.charAt(12)); -> runtime error StringIndexOutOfBounds

        // indexOf
        System.out.println(str.indexOf('a')); // 1
        System.out.println(str.indexOf('a', 2)); // 3
        System.out.println(str.indexOf("fun")); // 8
        System.out.println(str.indexOf("fun", 10)); // -1 -> not found

        // substring
        System.out.println(str.substring(8)); // fun
        // beginning index is included
        // the ending index is not included
        System.out.println(str.substring(0, 5)); // java
        // if both are the same, return empty
        System.out.println(str.substring(4, 4));

        //System.out.println(str.substring(4, 2)); -> out of range -> runtime error StringIndexOutOfBounds
        //System.out.println(str.substring(8, 14)); -> out of range ->  runtime error StringIndexOutOfBounds

        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
        dog.toUpperCase();
        System.out.println(dog);
        dog = dog.toUpperCase();
        System.out.println(dog);
    }

    private static void partTwo() {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        // equals / equalsIgnoreCase
        System.out.println(str.equals(str2)); // false cause J != j
        System.out.println(str.equalsIgnoreCase(str2)); // true
        System.out.println("abc".equalsIgnoreCase("ABC"));

        // startsWith / endsWith
        System.out.println(str.startsWith("j")); // true
        System.out.println(str.startsWith(str3)); // true
        System.out.println(str.startsWith("J")); // false cause J != j
        System.out.println(str.startsWith("J".toLowerCase())); // true

        System.out.println(str.endsWith("va")); // true
        System.out.println(str.endsWith("A")); // false
        System.out.println(str.endsWith("A".toLowerCase())); // true

        // contains
        System.out.println(str.contains(str3)); // true
        System.out.println(str.contains("av")); // true
        System.out.println("Java".contains("j")); // false cause J != j
        System.out.println("Java".contains("j".toUpperCase())); // true

        // replace
        String myString = "Java" + " " + "is"+ " " + "cool";
        System.out.println(myString.replace('a', 'A'));
        System.out.println(myString.replace(" ", "_"));
        System.out.println(myString.replace("is", "_"));
        System.out.println(myString);

        // trim -> remove the whitespaces in the beginning and at the end
        System.out.println("Ja va".trim());
        String anotherString = "            Java          is  cool                      ";
        System.out.println(anotherString);
        System.out.println(anotherString.trim());
    }
}

