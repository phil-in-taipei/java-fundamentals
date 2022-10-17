package labs_examples.lambdas.labs;
import java.util.*;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Predicate Built-in");

        String[] stringArray = {
                "interface", "teamwork", "archive", "fellowship", "meetup group"
        };
        PrintInfoClass.printDividerLine();

        List<String> listArrayTerms = Arrays.asList(stringArray);


        UtilitiesClass.printArray(stringArray);
        PrintInfoClass.printDividerLine();

        Predicate<String> noIInFilter = (s) -> !s.contains("i");

        System.out.println("These are the strings that don't contain 'i':");
        PrintInfoClass.printDividerLine();

        for (String str: listArrayTerms) {
            if (noIInFilter.test(str)) {
                System.out.println("There's no 'i' in: " + str);
            }
        }

        PrintInfoClass.printExerciseExit("Predicate Built-in");

    }




}
