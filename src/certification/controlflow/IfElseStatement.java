package certification.controlflow;

import com.sun.org.apache.xpath.internal.SourceTree;

public class IfElseStatement {

    public static void main(String[] args){
        boolean b = true;

        if (b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int x = 1;
        //if (x){}
        //if (x=1){}
        if (x==1){}

        int testScore = 76;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else if (testScore >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("grade = " +  grade);

        int hourOfDay = 10;
        if(hourOfDay < 11) System.out.println("Morning");
        else if (hourOfDay < 17) System.out.println("Afternoon");
        else
            System.out.println("Day");

        if (hourOfDay < 17) {
            System.out.println("Afternoon");
        } else if (hourOfDay < 11){ // 11 is < 17 this will never be executed
            System.out.println("Morning");
        } else {
            System.out.println("Evening");
        }

    }
}
