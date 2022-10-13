package labs_examples.generics.labs;

import labs_examples.multi_threading.labs.PrintInfoClass;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindroneArrayClass {

    public static void main(String[] args) {


        PrintInfoClass.printExerciseIntro("Find Number of Palindromes");

        PrintInfoClass.printDividerLine();

        System.out.println("First, test method to reverse a string");

        String testString = "test string";
        String checkTestString = "gnirts tset";
        PrintInfoClass.printDividerLine();

        System.out.println(testString);

        System.out.println(getReverseOfString(testString));

        System.out.println(checkTestString.equals(
                getReverseOfString(testString))
        );

        PrintInfoClass.printDividerLine();

        System.out.println("Second, test method to check if a string is a palindrome");
        PrintInfoClass.printDividerLine();
        System.out.println("bob");
        System.out.println(getReverseOfString("bob"));
        System.out.println(isAPalindrone("bob"));

        PrintInfoClass.printDividerLine();

        System.out.println("Third, test method to check number of palindromes in ListArray of Strings");
        PrintInfoClass.printDividerLine();
        System.out.println("There should be 4");
        String[] strArray = { "rotator", "World", "Hello", "bob", "madam", "kayak", "hooray" };
        ArrayList<String> strArrayVariable = new ArrayList(Arrays.asList(strArray));
        System.out.println(getNumberOfPalindronesInStringArray(strArrayVariable));
        System.out.println(getNumberOfPalindronesInStringArray(strArrayVariable) == 4);

        PrintInfoClass.printExerciseExit("Find Number of Palindromes");

    }

    public static String getReverseOfString(String str) {
        String reverseString = "";
        String ch;

        for (int i=0; i<str.length(); i++)
        {
            ch = String.valueOf(str.charAt(i));
            reverseString= ch + reverseString;
        }
        return reverseString;
    }

    public static boolean isAPalindrone(String str) {
        return str.equals(getReverseOfString(str));
    }

    public static int getNumberOfPalindronesInStringArray(ArrayList<? extends String> stringArray) {
        int numberOfPalindrones = 0;
        for (int i=0; i< stringArray.size(); i++) {
            if (isAPalindrone(stringArray.get(i))) {
                numberOfPalindrones++;
            }
        }
        return numberOfPalindrones;
    }


}
