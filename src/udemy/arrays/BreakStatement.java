package udemy.arrays;

public class BreakStatement {

    // we can use labels in
    // 1 - code block defined by curly braces
    // 2 - all loop statements (for, while, ...)
    // 3 - conditional statements (if, switch, ...)
    // 4 - assigns return statements
    // 5 - try blocks
    // 6 - throw statements

    // break stops the loop and moves to next block of code
    public static void main(String[] args) {
        //myLabel :
        //int[] myArray = {1, 2, 3}; -> can't be on variable creation

        myLabel: {
            int[] myArray = {1, 2, 3}; // only available here
        }

        String[] animals = {"DogTest", "Cat", "Lizard", "Bird", "Snake"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        MY_LOOP : for (String animal : animals) {
            if(animal.equals("Cat")) {
                break MY_LOOP; // unnecessary label -> stops the loop at "Cat"
            }
            System.out.println(animal); // just print dog
        }

        // confusing, pay attention
        animal : for (String animal : animals) {
            if(animal.equals("Cat")) {
                break animal; // unnecessary label as well -> stops the loop at "Cat"
            }
            System.out.println(animal); // just print dog as well
        }

        for(String animal : animals) {
            if(animal.equals("Lizard")) {
                break; // stops the loop at "Lizard"
            }
            System.out.println(animal); // print dog and cat
        }

        int index = 0;
        while(index < animals.length) {
            String animal = animals[index];
            if(animal.equals("Lizard")){
                break; // stops the loop at "Lizard"
            }
            System.out.println(animal); // print dog and cat
            index++;
        }
    }
}
