package labs_examples.objects_classes_methods.labs.methods;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//import labs_examples.objects_classes_methods.labs.methods.SomeOtherClass;

public class MethodTraining {
    public static void main(String[] args) {
        String WHITE_BACKGROUND = "\u001B[47m";
        String BLACK_TEXT = "\u001B[30m";
        String STANDARD_RESET = "\u001B[0m";

        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Demonstrate method overloading (using one method: returnStr)"
                + STANDARD_RESET
        );
        System.out.println("--------------------------------------------------------------------");
        String oneString = returnStr("String1");
        System.out.println("Using returnStr to concatenate 1 string: " + oneString);
        String twoStrings = returnStr("String1", "String2");
        System.out.println("Using returnStr to concatenate 2 strings: " + twoStrings);
        String twoCharstoString = returnStr('C', 'D');
        System.out.println("Using returnStr to concatenate 2 chars as a string: " + twoCharstoString);

        System.out.println("--------------------------------------------------------------------");


        //2) Demonstrate the difference between "pass by value" and "pass by reference"

        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Pass by value vs pass by method (addTwoInts & changeTwoObjectValues)"
                + STANDARD_RESET
        );
        System.out.println("--------------------------------------------------------------------");
        SomeOtherClass obj = new SomeOtherClass();
        obj.num = 4;
        obj.val = 10;
        int num = 4;
        int val = 10;
        int twoValuesAdded = addTwoInts(num, val);
        int twoObjValuesAdded = addTwoInts(obj.num, obj.val);
        System.out.println("Adding by passing in two values:" + twoValuesAdded);
        System.out.println("Adding by passing in two values of the object:" + twoObjValuesAdded);
        System.out.println("Calling method (changeTwoObjectValues) to change the values:");
        changeTwoObjectValues(obj);

        int twoObjValuesAddedAfter = addTwoInts(obj.val, obj.num);
        System.out.println("Adding again passing in two values of the object:" + twoObjValuesAddedAfter);


        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Method (returnLargestOfFour) will return the largest of 4 int args:"
                + STANDARD_RESET
        );
        System.out.println("--------------------------------------------------------------------");
        int largestOfFourNumbers = returnLargestOfFour(-4, -9,200, -219);
        System.out.println("the largest number of -4, -9, 200, -219: " + largestOfFourNumbers);

        //4) Write a method to count all consonants (the opposite of vowels) in a String
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Method (numberOfConsonants) to count all consonants in a String"
                + STANDARD_RESET
        );
        int numOfCons = numberOfConsonants("pastel");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("This is the number of consonants in the word 'pastel': " + numOfCons);

        //5) Write a method that will determine whether a number is prime
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Method (isPrime) will determine whether or not a number is prime"
                + STANDARD_RESET
        );
        System.out.println("--------------------------------------------------------------------");
        boolean thirtySevenIsPrime = isPrime(37);
        boolean thirtyFiveIsPrime = isPrime(35);
        System.out.println("37 is a prime number: " + thirtySevenIsPrime);
        System.out.println("35 is a prime number: " + thirtyFiveIsPrime);

        //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
        //        which is passed in as an argument
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Method (getHighestAndLowestNumbers) returns"
                + STANDARD_RESET
        );
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "array containing highest and lowest numbers"
                        + STANDARD_RESET
        );
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Highest and lowest numbers of 2, 4, 9, and 1 are:");
        int[] highestAndLowest = getHighestAndLowestNumbers(2, 4, 9, 1);
        System.out.println("Highest: " + highestAndLowest[0]);
        System.out.println("Lowest: " +  highestAndLowest[1]);

        //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        //divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        //length of the returned list
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Method (int maxNum, int divisor1, int divisor2) and "
                + STANDARD_RESET
        );
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "returns an Integer Arraylist each number between zero and"
                + STANDARD_RESET
        );
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                        "MaxNum that is divisible by both divisor1 and divisor2"
                        + STANDARD_RESET
        );
        System.out.println("--------------------------------------------------------------------");
        System.out.println("These are the numbers between 0 and 27 divisible by 3 and 2:");
        ArrayList<Integer> listOfNums = getUpToMaxDivisibleByTwoDivisors(27, 3, 2);
        System.out.print(" | ");
        for (int s : listOfNums){
            System.out.print(s + " | ");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");

        //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        //instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        //variable is used to temporarily store individual values in the array
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Method that will reverse an array in place" + STANDARD_RESET);
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "using only one extra temp variable" + STANDARD_RESET);
        System.out.println("--------------------------------------------------------------------");
        reverseArrayInPlace();



    }
    public static String returnStr(String str) {
        return str;
    }

    public static String returnStr(String str, String str2) {
        return str + str2;
    }

    public static String returnStr(char charVal, char charVal2) {
        String str = "" + charVal;
        String str2 = "" + charVal2;
        return str + str2;
    }

    public static int addTwoInts(int a, int b) {

        return a + b;
    }

    public static void changeTwoObjectValues(SomeOtherClass obj) {
        obj.num++;
        obj.val = obj.val + 10;
    }

    public static int returnLargestOfFour(int a, int b, int c, int d) {
        int[] intArr = { a, b, c, d };
        Arrays.sort(intArr);
        return intArr[3];
    }

    public static int numberOfConsonants(String str) {
        int numOfConsonants = 0;
        char[] vowelArr  = {'a', 'e', 'i', 'o', 'u'};
        ArrayList<String> vowels = new ArrayList<String>();
        for (char c : vowelArr) {
            vowels.add("" + c);
        }
        for (int i = 0; i < str.length(); i++) {
            String c = "" + str.charAt(i);
            int intChar = vowels.indexOf(c);
            if (intChar == -1) {
                numOfConsonants++;
            }
        }
        return numOfConsonants;
    }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


    public static int[] getHighestAndLowestNumbers(int a, int b, int... args) {
        ArrayList<Integer> highestAndLowestList = new ArrayList<>();
        highestAndLowestList.add(a);
        highestAndLowestList.add(b);
        for (int i : args) {
            highestAndLowestList.add(i);
        }
        Collections.sort(highestAndLowestList);
        int[] highestAndLowest = {
                highestAndLowestList.get(0),
                highestAndLowestList.get(highestAndLowestList.size() - 1)
        };

        return highestAndLowest;
    }

    public static ArrayList<Integer> getUpToMaxDivisibleByTwoDivisors(int max, int divisor1, int divisor2) {
        ArrayList<Integer> numbersDivisibleBy = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            if (i % divisor1 == 0 && i % divisor2 ==0) {
                numbersDivisibleBy.add(i);
            }
        }
        return numbersDivisibleBy;
    }

    public static void reverseArrayInPlace() {
        int[] nums = {45, 87, 62, 99, 1, 42, 12};
        System.out.println("Contents of array originally:");
        // print each element of the array to verify reverse order
        System.out.println("--------------------------------------------------------------------");
        for(int i : nums){
            System.out.print(i + " ");
        }

        int temp = 0;

        for(int i = 0; i < nums.length / 2; i++){
            temp++;
            int negIndexSwap = nums[nums.length - temp];
            nums[nums.length - temp] = nums[i];
            nums[i] = negIndexSwap;
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Contents of array after for loop:");
        // print each element of the array to verify reverse order
        System.out.println("--------------------------------------------------------------------");
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
    }


}

