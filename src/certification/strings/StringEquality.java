package certification.strings;

public class StringEquality {

    // we can create using literal -> ""
    // or the new operator
    // when we use "" to create string, java first looks for the string with the same value
    // in the string pool, if it's found, returns the reference, otherwise, creates a new string in the pool
    public static void main(String[] args) {
        // == checks the object reference
        // equals checks equality between objects
        String name = "John"; // puts "John" in the pool
        String anotherName = "John"; // gets the string from the pool
        String john = "Jo" + "hn"; // gets the string from the pool
        String newName = new String("John"); // create a new object on java heap, doest use the pool

        System.out.println("name == anotherName -> " + (name == anotherName));
        System.out.println("name == john -> " + (name == john));
        System.out.println("name == newName -> " + (name == newName));

        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));

        System.out.println("name hash -> " + System.identityHashCode(name));
        System.out.println("anotherName hash -> " + System.identityHashCode(anotherName));
        System.out.println("john hash -> " + System.identityHashCode(john));
        System.out.println("newName hash -> " + System.identityHashCode(newName));

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c"; // creating new string at runtime, it's not a literal
        String str4 = "ab" + "c";

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true

        System.out.println("str1 hash -> " + System.identityHashCode(str1));
        System.out.println("str2 hash -> " + System.identityHashCode(str2));
        System.out.println("str3 hash -> " + System.identityHashCode(str3));
        System.out.println("str4 hash -> " + System.identityHashCode(str4));
    }
}
