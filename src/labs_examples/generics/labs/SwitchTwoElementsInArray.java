package labs_examples.generics.labs;

import labs_examples.multi_threading.labs.PrintInfoClass;

public class SwitchTwoElementsInArray<T> {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Switch Items in Array");

        PrintInfoClass.printDividerLine();

        System.out.println("First, switch 2 string array items");
        PrintInfoClass.printDividerLine();

        String[] arrayStringVariable = {"Hello", "World"};
        SwitchTwoElementsInArray<String> switchTwoElementsInArray = new SwitchTwoElementsInArray<>();
        System.out.println("Original Strings:");
        PrintInfoClass.printDividerLine();

        switchTwoElementsInArray.printArray(arrayStringVariable);
        PrintInfoClass.printDividerLine();

        String[] switchedArray = switchTwoElementsInArray.switchItems(arrayStringVariable, 0, 1);
        System.out.println("Switched:");
        switchTwoElementsInArray.printArray(switchedArray);

        Integer[] intArrayVariable = {100, 300, 80, 90, 200};
        PrintInfoClass.printDividerLine();
        System.out.println("Original Integers:");
        PrintInfoClass.printDividerLine();
        SwitchTwoElementsInArray<Integer> switchTwoElementsInArray2 = new SwitchTwoElementsInArray<>();

        switchTwoElementsInArray2.printArray(intArrayVariable);
        Integer[] switchedArray2 = switchTwoElementsInArray2.switchItems(intArrayVariable, 3, 1);
        PrintInfoClass.printDividerLine();

        System.out.println("Switched:");
        PrintInfoClass.printDividerLine();
        switchTwoElementsInArray2.printArray(switchedArray2);

        PrintInfoClass.printExerciseExit("Switch Items in Array");
    }

    public T[] switchItems(T[] array, int index1, int index2){
        try {
            T swapVariableA = array[index1];
            T swapVariableB = array[index2];;

            array[index2] = swapVariableA;
            array[index1] = swapVariableB;
            return array;
        } catch (Exception exc) {
            System.out.println("An exception occurred : " + exc.getMessage());
            exc.printStackTrace();
        };
        return array;
    }

    public void printArray(T[] array) {
        for(T item : array){
            System.out.println(item);
        }
    }

}
