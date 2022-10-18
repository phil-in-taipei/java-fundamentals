package labs_examples.lambdas.labs;

import java.util.function.Supplier;
import java.util.ArrayList;

public class SupplierExample {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Supplier Built-in");
        PrintInfoClass.printDividerLine();
        System.out.println("Populate a a list array with random doubles between 1 and 1000:");
        PrintInfoClass.printDividerLine();
        Supplier<Double> randomValue = () -> Math.random() * (1000-1) + 1;

        ArrayList<Double> randomDoubles = new ArrayList();
        for(int i = 0; i < 5; i++) {
            randomDoubles.add(randomValue.get());
        }

        UtilitiesClass.printArray(randomDoubles.toArray());
        PrintInfoClass.printExerciseExit("Supplier Built-in");

    }


}
