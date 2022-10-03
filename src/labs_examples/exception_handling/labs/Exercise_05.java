package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    static int[] intArray = { 1092810320, 50, 42, 0, 2, 249, 0};

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        System.out.println("Throwing an exception example:");

        System.out.println("--------------------------------------------------");
        System.out.println("**************************************************");
        try {
            methodOne();
        } catch(ArithmeticException exc){
            System.out.println("exception caught");
        }

    }

    public static void methodOne() throws ArithmeticException {
        for (int i : intArray) {
            methodTwo(i);
        }
    }

    public static void methodTwo(int arrayItem) throws ArithmeticException {
        try {
            int x = 100 / arrayItem;
            System.out.println("It's OK, you can divide 100 by: " + arrayItem);
        } catch (ArithmeticException exc){
            System.out.println("Exception caught in methodTwo");
            System.out.println("You cannot divide 100 by zero!!");
            System.out.println(exc.toString());
            System.out.println("Now manually throwing exception back to methodOne");

            throw exc;
        } finally {
            System.out.println("Finishing up loop iteration");
        }
    }
}