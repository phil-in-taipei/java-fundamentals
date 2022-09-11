package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Enter a number between 1 and 500: ");
        // assign input to variable as int
        int lowNum = scanner.nextInt();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("You entered: " + lowNum);
        if (1 <= lowNum && lowNum <= 500) {
            System.out.println("That is a valid number!");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("Enter another number between " + lowNum + " and 500: ");
            // assign input to variable as int
            int highNum = scanner.nextInt();
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("You entered: " + highNum);
            if (lowNum < highNum && highNum < 501) {
                System.out.println("That is a valid number!");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Now for some calculations ...");
                int sum = 0;
                float difference = (highNum  + 1) - lowNum;
                for (int i = lowNum; i <= highNum; i++) {
                    //System.out.println(i);
                    sum += i;
                }
                System.out.println("The sum of the two numbers is: " + sum);
                System.out.println("The average is the two numbers is: " + sum / difference);
            } else {
                System.out.println("That is an invalid number!");
            }
        } else {
            System.out.println("That is an invalid number!");
        }

    }
}
