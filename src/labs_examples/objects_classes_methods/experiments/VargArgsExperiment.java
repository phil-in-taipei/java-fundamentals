package labs_examples.objects_classes_methods.experiments;

public class VargArgsExperiment {
    public static void main(String[] args) {

        // please create the varargs method as instructed below
        // then, please call the varargs method at least 3 // times here with a
        // different number of arguments
        System.out.println("");
        System.out.println("These are two vargargs methods");
        System.out.println("First prints out the arg strings");
        System.out.println("Second returns the number of args");
        System.out.println("---------------------------------");

        System.out.println("With one argument:");
        System.out.println("---------------------------------");
        printArgs("hello");
        int argsLength = countArgs("hello");
        System.out.println(argsLength);

        System.out.println("---------------------------------");
        System.out.println("With two arguments:");
        System.out.println("---------------------------------");

        printArgs("hello", "hi");
        argsLength = countArgs("hello", "hi");
        System.out.println(argsLength);

        System.out.println("---------------------------------");
        System.out.println("With three arguments:");
        System.out.println("---------------------------------");

        argsLength = countArgs("hello", "hi", "Nice to meet you!");
        System.out.println(argsLength);

        System.out.println("---------------------------------");

    }

    public static void printArgs(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    // please write a varargs method of your choice that
    // prints out the length of the array of arguments
    // passed into the method below
    public static int countArgs(String... args) {
        int count = 0;
        for (String s : args) {
            count++;
        }
        return count;
    }
}
