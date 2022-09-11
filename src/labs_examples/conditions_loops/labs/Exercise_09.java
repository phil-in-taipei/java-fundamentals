package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("I am going to demonstrate a 'break' statement:");
        System.out.println("It will stop counting at 7");
        System.out.println("----------------------------------------------");
        for(int i = 0; i < 25; i++){
            System.out.println(i);
            if (i == 7) {
                System.out.println("Break now!");
                break;
            }
        }
        System.out.println("----------------------------------------------");

    }
}
