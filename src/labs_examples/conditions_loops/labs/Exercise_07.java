package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        String vowels = "aeiou";
        // create scanner
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a word");

        String str = myObj.nextLine();  // Read user input
        System.out.println("You entered: " + str);  // Output user input
        String vowelsInStr = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if(str.charAt(i) == vowels.charAt(j)) {
                    vowelsInStr += str.charAt(i);
                }
            }
        }
        System.out.println("These are the vowels (if any) in the string: " + vowelsInStr);
        if (vowelsInStr.length() > 0) {
            System.out.println("This is the first vowel: " + vowelsInStr.charAt(0));
        }
    }
}
