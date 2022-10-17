package labs_examples.lambdas.labs;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorInterfaceExample {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Binary Operator Built-in");
        PrintInfoClass.printDividerLine();

        System.out.println("Use built in binary operator interface to do simple addition of integers");
        PrintInfoClass.printDividerLine();

        BinaryOperator<Integer> sumOfTwoIntegers = (a, b) -> a + b;

        int integerVar = sumOfTwoIntegers.apply(5, 10);
        System.out.println("Five plus 10 equals: " + integerVar);

        PrintInfoClass.printExerciseExit("Binary Operator Built-in");
    }
}
