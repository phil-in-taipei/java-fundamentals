package labs_examples.generics.labs;

import labs_examples.multi_threading.labs.PrintInfoClass;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericArrayListController {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Generic ArrayList Sum:");

        PrintInfoClass.printDividerLine();
        Integer[] intArray = { 200, 400, 2332, 329032, 23323 };
        System.out.println("First the sum of an array of integers: ");
        PrintInfoClass.printDividerLine();

        ArrayList<Integer> integerArrayVariable = new ArrayList(Arrays.asList(intArray));
        System.out.println(GenericArrayList.sumOfNumbersInArray(integerArrayVariable));

        PrintInfoClass.printDividerLine();
        System.out.println("Second the sum of an array of doubles:");
        PrintInfoClass.printDividerLine();

        Double[] doubleArray = { 11.5, 110.5, 10.9, 10.12, 10.5, };
        ArrayList<Double> doubleArrayVariable = new ArrayList(Arrays.asList(doubleArray));
        System.out.println(GenericArrayList.sumOfNumbersInArray(doubleArrayVariable));

        PrintInfoClass.printExerciseExit("Generic ArrayList Sum:");
    }
}

