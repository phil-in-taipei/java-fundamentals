package labs_examples.lambdas.labs;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Unary Operator");
        PrintInfoClass.printDividerLine();
        System.out.println(
                "Takes in an string and returns the same type (string) modified"
                + "\nin this case changed to upper case and repeated around underscore"
        );

        PrintInfoClass.printDividerLine();
        UnaryOperator<String> changeToUpperCaseTwice = (arg) -> arg.toUpperCase().concat(
                "_".concat(arg.toUpperCase())
        );

        System.out.println(
                "The word 'repeat' modifies to: "
                + changeToUpperCaseTwice.apply("repeat")
        );

        PrintInfoClass.printExerciseExit("Unary Operator");
    }
}
