package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("The exercise will demonstrate a series of methods");
        System.out.println("------------------------------------------------------");

        System.out.println("The first will multiply:");
        System.out.println("------------------------------------------------------");
        int product = multiply(4, 5);
        System.out.println("This is the product of 4 and 5: " + product);

        System.out.println("------------------------------------------------------");
        System.out.println("The second will divide two ints:");
        System.out.println("------------------------------------------------------");
        float quotient = divide(4, 5);
        System.out.println("This is the quotient of 4 and 5: " + quotient);

        System.out.println("------------------------------------------------------");
        System.out.println("The third will will print a joke:");
        System.out.println("------------------------------------------------------");
        System.out.print("The name of a punk band of developers : ");
        printBandName("The Rejex");

        System.out.println("------------------------------------------------------");
        System.out.println("The fourth will convert years to seconds:");
        System.out.println("------------------------------------------------------");
        double seconds = convertYearToSeconds(5);
        System.out.println("This is the number of seconds in 5 years: " + seconds);

        System.out.println("------------------------------------------------------");
        System.out.println("The fifth will return the variable length of an array:");
        System.out.println("------------------------------------------------------");
        int howManyStrings = countArgs("These", "are", "four", "words");
        System.out.println("The phrase 'These are four words' is this long: " + howManyStrings);

        System.out.println("------------------------------------------------------");
        System.out.println("Ok, done!");
        System.out.println("------------------------------------------------------");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static float divide(int a, int b) {
        float aFloat = a;
        float bFloat = b;
        return aFloat / bFloat;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    static void printBandName(String str) {
        System.out.println(str);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static double convertYearToSeconds(int year) {
        double secondsConversion = year * 31557600;
        return secondsConversion;
    }
    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int countArgs(String... args) {
        int count = 0;
        for (String s : args) {
            count++;
        }
        return count;
    }






}
