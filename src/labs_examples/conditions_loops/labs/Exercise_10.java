package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("An example of 'continue' to print odd numbers between 1 and 20:");
        System.out.println("---------------------------------------------------------------");
        // print odd numbers between 1 and 20
        // includes 0
        for(int i=1; i<=20; i++) {
            if(i % 2  == 0) { // even number, so skip
                continue; // iterate
            }
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("OK, done!");
    }
}
