package labs_examples.datastructures.trees.experiments;

import java.util.Arrays;

public class ManipulateArrayPractice {
    public static void main(String[] args) {
        String[] stringArray = {"Jack1", "Sue2", "Xena3", "Bob4", "Yo-yo5", "Grace6"};
        printArrayItems(stringArray);

        System.out.println();

        System.out.println("After sorting:");
        String[] sortedStringArray = reverseArrayItems(stringArray);
        printArrayItems(sortedStringArray);

        System.out.println();
        Double[] doubleArray = {3283201.0, 2183210.0, 100988.0, 3003218.0, 13210821.0, 323210.0};
        printArrayItems(doubleArray);
        System.out.println("After sorting");
        Double[] sortedDoublesArray = reverseArrayItems(doubleArray);
       printArrayItems(sortedDoublesArray);
    }

    public static <T> void printArrayItems(T[] stringArray) {
        for (int i =0; i< stringArray.length; i++) {
            System.out.println("Item: " + i + " " + stringArray[i]);
        }
    }


    public static <T> T[] reverseArrayItems(T[] stringArray) {
        System.out.println("Array length: " + stringArray.length);
        int pivotIndex = stringArray.length / 2;
        System.out.println("Pivot Index:  " + pivotIndex);
        for  (int i =0; i < pivotIndex; i++) {
            T swapVariable = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - i -1];
            stringArray[stringArray.length - i -1] = swapVariable;
        }
        return stringArray;
    }



}
