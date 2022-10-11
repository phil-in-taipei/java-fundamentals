package labs_examples.generics.experiments;

public class GenericMethodsNormal {
    public static void main(String[] args) {
        // Step 1) create an array of 5 stings then call the printArray() method and
        // pass the String array
        String[] strArrayVariable = { "Hello", "World", "Hello", "World", "World" };
        printArray(strArrayVariable);

        // Step 1) create an array of 5 ints then call the printArray() method and pass
        // the int array
        Integer[] intArrayVariable = { 200, 400, 2332, 329032, 23323 };
        printArray(intArrayVariable);
        // Step 1) create an array of 5 doubles then call the printArray() method and
        // pass the double array
        Double[] doubleArrayVariable = { 11.5, 110.5, 10.9, 10.12, 10.5, };
        printArray(doubleArrayVariable);

    }

    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
