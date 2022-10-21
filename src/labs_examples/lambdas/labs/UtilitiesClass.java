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


    static int sumOfString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += str.charAt(i) - '0';
            }
        }
        return sum;
    }



}
