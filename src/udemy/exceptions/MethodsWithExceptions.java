package udemy.exceptions;

class NoMoreMeatException extends Exception {}

class NoMorePlantsException extends RuntimeException {}

interface Omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;
    void eatPlants(int amount);
}

class Bear implements Omnivore {
    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        if (amount <= 0){
            throw new NoMoreMeatException();
        }

        System.out.println("Eating meat.");
    }

    @Override
    public void eatPlants(int amount) {
        if (amount <= 0){
            throw new NoMorePlantsException();
        }

        System.out.println("Eating plants.");
    }
}

public class MethodsWithExceptions {

    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(2);
            bear.eatPlants(-2);
        } catch (NoMorePlantsException e) {
            e.printStackTrace();
            System.out.println("No plants");
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        } catch (NoMoreMeatException e) {
            e.printStackTrace();
            System.out.println("Bear is hungry.");
        } finally {
            System.out.println("finally");
        }

        System.out.println();

        try {
            bear.eatPlants(2);
            bear.eatMeat(-2);
        } catch (NoMoreMeatException | NoMorePlantsException  e){//  | RuntimeException -> parent class and subclass can't be in a multi-catch
            System.out.println("No more food.");
        }
    }
}
