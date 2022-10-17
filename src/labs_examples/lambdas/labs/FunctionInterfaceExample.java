package labs_examples.lambdas.labs;

import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Function Built-in");
        PrintInfoClass.printDividerLine();

        System.out.println("Use built in function interface to convert float to double");
        PrintInfoClass.printDividerLine();

        float floatVar = 3339899.0344921023231100f;
        System.out.println("This is the original float variable: " + floatVar);
        Function<Float, Double> floatToDouble = a -> Double.valueOf(a);
        PrintInfoClass.printDividerLine();

        double doubleVar = floatToDouble.apply(floatVar);
        System.out.println("Now it has been converted to a double: " + doubleVar);

        PrintInfoClass.printExerciseExit("Function Built-in");
    }
}
