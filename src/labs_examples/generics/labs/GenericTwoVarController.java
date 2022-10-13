package labs_examples.generics.labs;

import labs_examples.generics.experiments.GenericClassWithBoundedTypes;
import labs_examples.multi_threading.labs.PrintInfoClass;

public class GenericTwoVarController {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Generic Class with Two Variables:");

        PrintInfoClass.printDividerLine();

        System.out.println("First implementation with String and Integer:");
        PrintInfoClass.printDividerLine();

        GenericWithTwoVariables<String, Integer> obj1 = new GenericWithTwoVariables<>("Hello", 1000);
        System.out.println(obj1.toString());

        PrintInfoClass.printDividerLine();

        System.out.println("Get and reset variables:");
        PrintInfoClass.printDividerLine();

        obj1.setVariable1("Word");
        obj1.setVariable2(obj1.getVariable2() + 1000);

        System.out.println(obj1.toString());

        PrintInfoClass.printDividerLine();

        System.out.println("Second implementation with Double and String:");
        PrintInfoClass.printDividerLine();

        GenericWithTwoVariables<Double, String> obj2 = new GenericWithTwoVariables<>(
                1119999.032032023231100d, "Cha-Cha");
        System.out.println(obj2.toString());

        PrintInfoClass.printDividerLine();

        System.out.println("Get and reset variables:");
        PrintInfoClass.printDividerLine();

        obj2.setVariable1(obj2.getVariable1() * 2);
        obj2.setVariable2(obj2.getVariable2().concat("-Cha")); //"Word"

        System.out.println(obj2.toString());

        PrintInfoClass.printExerciseExit("Generic Class with Two Variables:");

    }
}

