package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("This is a 'do-while' loop, which prints out every " +
                "\nthird number counting backwards from 1000 to 1:");
        System.out.println("--------------------------------------------------");
        int index = 1000;
        int counter = 0;
        do {
            counter++;
            if (counter % 3 == 0){
                System.out.println(index);
            }
            index--;
        }while(index > 0);

        System.out.println("--------------------------------------------------");
        System.out.println("OK, done!");
    }
}
