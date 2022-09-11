package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        System.out.println("");
        System.out.println("This is a 'while' loop find the sum of numbers to from 1-100");
        System.out.println("-------------------------------------------------------------");
        while(i < 101) {
            sum += i;
            System.out.println("The sum is: " + sum);
            i++;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("OK, done!");
    }
}
