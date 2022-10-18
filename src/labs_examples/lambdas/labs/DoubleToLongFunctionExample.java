package labs_examples.lambdas.labs;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionExample {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Double to Long Built-in");
        PrintInfoClass.printDividerLine();
        System.out.println("This will return a double value multiplied by 2 as a long");
        PrintInfoClass.printDividerLine();

        DoubleToLongFunction twiceTruncatedValue = doubleVariable -> (long) doubleVariable * 2;

        System.out.println(
                "This value, 10.623328320803203232, multiplied by two as a long: "
                + twiceTruncatedValue.applyAsLong(10.623328320803203232)
        );

        PrintInfoClass.printExerciseExit("Double to Long Built-in");
    }

}
