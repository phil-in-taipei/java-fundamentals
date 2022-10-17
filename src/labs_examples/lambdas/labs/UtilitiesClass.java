package labs_examples.lambdas.labs;

public class UtilitiesClass {
    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        System.out.print("Array Items: ");
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.print("\n");
    }





}
