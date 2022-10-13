package labs_examples.generics.labs;

import labs_examples.multi_threading.labs.PrintInfoClass;

public class GenericMethodSumOfNumbers {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Generic Method Numbers Sum");

        PrintInfoClass.printDividerLine();

        System.out.println("First implementation with decimal numbers:");
        PrintInfoClass.printDividerLine();
        System.out.println(sumOfNumbers(200.344, 300.001));
        PrintInfoClass.printDividerLine();

        System.out.println("Second implementation with integers:");
        PrintInfoClass.printDividerLine();

        System.out.println(sumOfNumbers(999, 501));

        PrintInfoClass.printExerciseIntro("Generic Method Numbers Sum");
    }

    public static <T extends Number, U extends Number> double sumOfNumbers(
            T firstNumber, U secondNumber){
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

}
