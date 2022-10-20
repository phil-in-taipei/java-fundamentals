package labs_examples.lambdas.labs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface SpecialDisplayInterface{
    void specialDisplay();
}

public class PeoplesNames {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Static Reference and Instance Reference");
        PrintInfoClass.printDividerLine();
        System.out.println("Reference to static functions to print students with more than 2 letters:");
        PrintInfoClass.printDividerLine();
        System.out.println("Original list of names:");
        List<String> list = Arrays.asList("Don", "Sue", "Di", "Deborah", "Chad");
        UtilitiesClass.printArray(list.toArray());
        PrintInfoClass.printDividerLine();
        System.out.println("Names with more than 2 letters:");
        UtilitiesClass.printArray(
                findNames(list, PeoplesNames::hasEnoughLetters).toArray()
        );

        PrintInfoClass.printDividerLine();
        System.out.println("Reference to instance method to print a basic message:");

        PeoplesNames peoplesNamesObj = new PeoplesNames();

        SpecialDisplayInterface referenceToInstanceMethod = peoplesNamesObj :: printOutIntro;
        referenceToInstanceMethod.specialDisplay();

        PrintInfoClass.printExerciseExit("Static Reference and Instance Reference");
    }

    public void printOutIntro(){
        System.out.println("This will print using an instance method reference");
    }
    public static boolean hasEnoughLetters(String name) {
        return name.length() > 2;
    }
    public static List<String> findNames(List<String> l, Predicate<String> p) {
        List<String> newList = new ArrayList<>();
        for(String s : l) {
            if(p.test(s)) {
                newList.add(s);
            }
        }
        return newList;
    }
}
