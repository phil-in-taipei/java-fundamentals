package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {


        // color formatting
        String STANDARD_RESET = "\u001B[0m";
        String RED_BACKGROUND = "\u001B[41m";
        String ANSI_YELLOW = "\u001B[33m";
        String PURPLE_BACKGROUND = "\u001B[45m";
        String BLACK_TEXT = "\u001B[30m";

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();

        // write completed code here
        System.out.println("You entered this number:");
        System.out.println(PURPLE_BACKGROUND + BLACK_TEXT
                + days
                + STANDARD_RESET);

        if(1 <= days && days <= 1000000) {
            System.out.println("Ok, it is within the range!");

            double secondsConversion = days * 86400;
            System.out.println("It is this many seconds");
            System.out.println(ANSI_YELLOW
                    + "Seconds: "
                    + secondsConversion
                    + STANDARD_RESET);

        } else {
            System.out.println("-------------------------------------");
            System.out.println(RED_BACKGROUND + BLACK_TEXT
                    + "That number is outside of the range!"
                    + STANDARD_RESET);
        }

    }
}