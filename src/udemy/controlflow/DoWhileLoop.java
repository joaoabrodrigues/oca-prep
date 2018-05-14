package udemy.controlflow;

public class DoWhileLoop {

    public static void main(String[] args) {
        int a = 0;
        do {
            a++;
        } while(false);

        System.out.println("a = " + a);



        //while (false) {
        //a++;
        //unreachable statement
        //}

        //while (true) {
        //a++;
        //endless loop
        //}


        //while e do-while sometimes have  the same behavior
        int x = 20;
        while(x > 10) x--;
        System.out.println("x = " + x);

        int x2 = 20;
        do x2--;
        while (x2 > 10);
        System.out.println("x2 = " + x2);

        int y = 10;
        int z = 5;
        while (y < 20)
            y++;
        // y = 20
        z += 2;
        // z = 7
        y += 10;
        // y = 30

        System.out.println("y = " + y);
        System.out.println("z = " + z);

        int number = 10;
        while (number > 10) {
            number--;
        }

        do{
            number--;
            //number = 9
            while(number > 5){
                number -= 2;
                // number = 10
            }
        } while (number > 10);

        System.out.println("number = " + number);

        do{
            number--;
            //number = 9
            while(number > 5){ //this is a infinite loop
                number += 1;
                // number = 10
            }
        } while (number < 10);
    }
}
