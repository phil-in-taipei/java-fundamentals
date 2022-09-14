package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        System.out.println("-------------------------------------------");
        System.out.println("Please enter an integer between 1 and 10: ");


        Scanner scanner = new Scanner(System.in);
        int usersInt = scanner.nextInt();
        if (usersInt > 0 && usersInt <= 10) {
            System.out.println("-------------------------------------------");
            System.out.println("You entered the following valid number: " + usersInt);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == usersInt) {
                    System.out.println("-------------------------------------------");
                    System.out.println("The index of " + usersInt + " is : " + i);
                    break;
                }
               // break;
            }
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("Sorry, " + usersInt + " is an invalid number!");
        }


    }
}