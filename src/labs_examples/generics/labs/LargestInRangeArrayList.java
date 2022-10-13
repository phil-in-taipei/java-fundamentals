package labs_examples.generics.labs;

import labs_examples.multi_threading.labs.PrintInfoClass;

public class LargestInRangeArrayList {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Find Largest Item in Array within Range");
        PrintInfoClass.printDividerLine();
        Integer[] intArrayVariable = {200, 400, 2332, 329032, 23323};
        System.out.println(getMax(intArrayVariable, 1, 3));

        Double[] doubleArrayVariable = {11.5, 110.5, 10.9, 10.12, 10.5,};
        System.out.println(getMax(doubleArrayVariable, 1, 3));

        PrintInfoClass.printExerciseExit("Find Largest Item in Array within Range");
    }

    public static <T extends Comparable<T>> T getMax(T[] array, int index1, int index2) {
        T max = array[index1];   // assume array[index1] is initially the largest
        for (int i = index1; i < index2; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];   // y is the largest so far
            }
        }

        return max;   // returns the largest object
    }

}
