package labs_examples.lambdas.labs;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {

    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Double Predicate Built-in");
        PrintInfoClass.printDividerLine();
        System.out.println("Creating 3 conditions to check is square of a double is between 25 and 100:");
        PrintInfoClass.printDividerLine();

        DoublePredicate squareUnder100
                = (x) -> { return x * x < 100.0; };


        DoublePredicate squareOver25
                = (x) -> { return x * x > 25; };

        DoublePredicate squareBetween50And100 = squareUnder100.and(squareOver25);

        System.out.println("Now checking it a double passes the test:");
        PrintInfoClass.printDividerLine();

        System.out.println(
                "The square of 6, which is " + 6*6  +  ", passes the test: "
                + squareBetween50And100.test(6)
        );

        PrintInfoClass.printExerciseExit("Double Predicate Built-in");

    }




}
