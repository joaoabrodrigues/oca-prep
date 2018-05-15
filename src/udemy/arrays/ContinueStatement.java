package udemy.arrays;

public class ContinueStatement {

    // continue statement jumps to the next iteration of the loop
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println();

        MY_LOOP :
        for(String animal : animals) {
            if(animal.equals("Cat")) {
                continue MY_LOOP; // jumps to "Lizard"
            }
            System.out.println(animal); // does not print "Cat"
        }

        System.out.println();

        animal :
        for(String animal : animals) {
            if(animal.equals("Cat")) {
                continue animal; // jumps to "Lizard"
            }
            System.out.println(animal); // does not print "Cat"
        }

        System.out.println();

        for(String animal : animals) {
            if(animal.equals("Cat") || animal.equals("Lizard")) {
                continue; // jumps to "Bird"
            }
            System.out.println(animal); // does not print "Cat"
        }

        System.out.println();

        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];
            index++;

            if(animal.equals("Lizard")){
                continue; //skip current iteration
            }

            System.out.println(animal);
            // index++; -> here, we have an infinite loop caused by the continue statement
        }
    }
}
