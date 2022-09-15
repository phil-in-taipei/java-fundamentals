package labs_examples.objects_classes_methods.experiments;

public class MethodParametersExp {
    public static void main(String[] args) {

        // please write the four methods as instructed below
        // then call each method from here within the main()
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Multiplication:");
        System.out.println("------------------------------------");
        int multRes = multiplyNums(3, 4);
        System.out.println("This is the mult result: " + multRes);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Division:");
        System.out.println("------------------------------------");
        int divideRes = divideNums(10, 2);
        System.out.println("This is the div result: " + divideRes);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Odd or even check:");
        System.out.println("------------------------------------");
        boolean twoIsOdd = isOdd(2);
        System.out.println("Two is odd: " + twoIsOdd);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Reversing a string:");
        System.out.println("------------------------------------");
        String revString = reverseString("Reverse this!");
        System.out.println("Reverse this! -- " + revString);

        System.out.println("------------------------------------");
    }

    // please write a static multiply() method below that takes
    // two parameters (argumets) and returns the result of
    // multiplying them together
    public static int multiplyNums(int numA, int numB) {
        int result = numA + numB;
        return result;
    }

    // please write a static divide() method below that takes
    // two parameters (argumets) and returns the result of
    // dividing the first parameter by the second parameters
    public static int divideNums(int numA, int numB) {
        int result = numA / numB;
        return result;
    }

    // please write a static isOdd() method that takes one numeric
    // parameter and returns a true (boolean) if the parameter is odd
    public static boolean isOdd(int numA) {
        boolean isOdd = numA % 2 != 0;
        return isOdd;
    }

    // please write a method that will take in a String (as an argument)
    // and return that String in reverse order. For instance, if you pass
    // in the String "programming is cool" the method will return the
    public static String reverseString(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i > 0; i--) {
            char subStr = str.charAt(i);
            revStr += Character.toString(subStr);
        }
        return revStr;
    }
}
