package labs_examples.datastructures.trees.experiments;

public class ReverseDigitsPractice {

    private static int reversedNumber;
    //private static int lastDigit;

    public ReverseDigitsPractice() {
        this.reversedNumber = 0;
        //this.lastDigit =  Integer.parseInt(null);
    }

    public static void main(String[] args) {

        int originalNumber = 33232010;
        //int lengthOfNumber = getLengthOfInteger(originalNumber);
        //System.out.print("Length of original number: ");
        //System.out.println((int)Math.pow(10, lengthOfNumber));

        //int reversedNumber = reverseDigitsRecursive(originalNumber);
        //System.out.println("Recursive result: "  + reversedNumber);


        originalNumber = 33232010;
        reversedNumber = reverseDigitsIterative(originalNumber);
        System.out.println("Iterative result: " + reversedNumber);


        originalNumber = 33232010;
        reversedNumber = 0;
        reversedNumber = reverseDigitsRecursiveAlt(originalNumber);
        System.out.println("Alternative recursive result: " + reversedNumber);
    }

    public static int multiplyNumberByTenAndAddToNew(int lastDigit) {
        return 10 * reversedNumber + lastDigit;
    }

    public static int getLastDigit(int num) {
        return num % 10;
    }

    public static int getNumberWithoutLastDigit(int originalNumber) {
        return originalNumber / 10;
    }

    public static int reverseDigitsIterative(int originalNumber) {
        while (originalNumber != 0) { // originalNumber % 10 != originalNumber
            int lastDigit = getLastDigit(originalNumber);
            reversedNumber = multiplyNumberByTenAndAddToNew(lastDigit);
            originalNumber = getNumberWithoutLastDigit(originalNumber);
        }
        return reversedNumber;
    }

    public static int reverseDigitsRecursive(int number) {
        if (number % 10 == number) {
            return number;
        }

        int last = getLastDigit(number);
        int remaining = getNumberWithoutLastDigit(number);
        int l = getLengthOfInteger(remaining);
        return last * (int)Math.pow(10, l)
                + reverseDigitsRecursive(remaining);
    }

    public static int reverseDigitsRecursiveAlt(int originalNumber) {
        if (originalNumber == 0) { //originalNumber % 10 == originalNumber
            return reversedNumber;
        }
        int lastDigit = getLastDigit(originalNumber);
        reversedNumber = multiplyNumberByTenAndAddToNew(lastDigit);
        originalNumber = getNumberWithoutLastDigit(originalNumber);
;       return reverseDigitsRecursiveAlt(originalNumber);
    }

    public static int getLengthOfInteger(int number) {
        // returns the length of a given number
        return (int)(Math.log10(number)) + 1;
    }




}
