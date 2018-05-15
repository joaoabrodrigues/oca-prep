package udemy.controlflow;

import java.util.Random;

public class SwitchStatement {
    // data types supported by switch
    // primitives: int, short, char, byte
    // wrappers: Integer, Short, Character, Byte, String
    // enums
    // we can't use "continue" statement with switch
    public static void main(String[] args) {
        Random rand = new Random();
        int dayOfWeek = rand.nextInt(6);

        //without 'break' statement, all will be printed
        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                //break; -> optional cause it's the last option
        }

        int c = rand.nextInt(26) + 'a'; // adding offset to produce lower case letters
        System.out.println((char) c + ", " + c + "");

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("Sometimes vowel");
                break;
            default:
                System.out.println("Consonant");
        }

        int x = 4;
        switch (x) {
            case 4:
            //case x: -> case must be constant
            case 'K':
            //case "Test": -> trying to use string instead of int
        }

        System.out.println();

        int num = 120;
        switch (num) { // always will execute what comes first, even the default statement comes first
            default:
                System.out.println("default");
            case 0:
                System.out.println("case1");
            case 10*2-10:
                System.out.println("case2");
                break;
        }
    }
}
