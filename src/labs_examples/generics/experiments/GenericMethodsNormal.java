package labs_examples.generics.experiments;

import java.util.ArrayList;

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


        // now use multiply with generic numbers:
        System.out.println(multiply(10, 20));



    }

    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T extends Number, V extends Number> int multiply(T firstNum, V secondNum) {
        return firstNum.intValue() * secondNum.intValue();
    }

    public static double sumCollection(ArrayList<? extends Number> nums) {
        double sum = 0;
        for (int i=0; i< nums.size(); i++) {
            sum += (double) nums.get(i);
        }
        return sum;
        // returns sum of array with any kind of numbers input
    }

    public static <S extends Number> void square(S val) {
        System.out.println(val.intValue() * val.intValue());
        // prints the int square of the number
    }

    public static <S> void doSomething(S val) {
        System.out.println(val);
        // prints an input regardless of type
    }
}
