package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("You will be prompted to enter 10 integers: ");

        Scanner scanner = new Scanner(System.in);
        int[] tenInts = new int[10];
        // prompt user
        for (int i = 0; i < tenInts.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Enter a whole number: ");
            // assign input to variable as int
            int newInt = scanner.nextInt();
            tenInts[i] = newInt;
        }

        System.out.println("-------------------------------------------");
        System.out.println("You have entered the following numbers: ");

        for (int i =0; i < tenInts.length; i++) {
            System.out.print("| ");
            System.out.print(tenInts[i] + " ");
        }
        System.out.print("|");
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("The sum of the numbers is as follows: ");

        float sum = 0;
        for (int i =0; i < tenInts.length; i++) {
            sum += tenInts[i];
        }
        System.out.println(sum);

        float average = sum / tenInts.length;

        System.out.println("-------------------------------------------");
        System.out.println("The average is as follows: ");
        System.out.println(average);

        System.out.println("-------------------------------------------");
        System.out.println("Ok, done!");


    }


}