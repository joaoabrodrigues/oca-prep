package I.java.basics;

public class WholeNumericPrimitiveTypes {

    public static void main(String[] args) {
        // compilation fails cause all numbers in java are int by default,
        // and this number is too large to be int
        // long max = 32123456789;

        // you need to specify that is a long value with 'l'
        // l = looks like 1, so, don't use it
        // since java 7, we can use underscores to read the number easier
        // the underscore only can't be at the beginning
        long max = 32_123_456_789L;

        //compilation fails
        //long n = _2300;
        long n = 2_300L;

        // octal is declared with prefix 0 and only contains 0-7
        // compilation fails
        // int oct = 08; // is not a octal number
        // int oct = 09; // is not a octal number
        int firstOct = 010; // 8 decimal
        int secondOct = 022; // 18 decimal


        int sumOct = firstOct + secondOct; // 26 decimal, 32 octal
        System.out.println("Octal");
        System.out.println("firstOct = " + firstOct + " secondOct = " + secondOct);
        System.out.println("decimal sum = " + sumOct + " oct sum = " + Integer.toOctalString(sumOct));

        // hexadecimal  (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal

        int sumHex = firstHex + secondHex; // 45 decimal, 2d hex
        System.out.println("Hex");
        System.out.println("firstHex = " + firstHex + " secondHex = " + secondHex);
        System.out.println("decimal sum = " + sumHex + " hex sum = " + Integer.toHexString(sumHex));

        // binary starts with 0b (0-1)
        int firstBinary = 0b1001; // 9 decimal
        int secondBinary = 0b0111; // 7 decimal
        // compilations fails, is too large
        // int thirdBinary = 0b2;

        int sumBinary = firstBinary + secondBinary; // 16 decimal, 10000
        System.out.println("Bin");
        System.out.println("firstBin = " + firstBinary + " secondBin = " + secondBinary);
        System.out.println("decimal sum = " + sumBinary + " binary sum = " + Integer.toBinaryString(sumBinary));
    }
}
