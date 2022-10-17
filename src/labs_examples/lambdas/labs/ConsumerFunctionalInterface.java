package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Built-in Consumer Interface");
        PrintInfoClass.printDividerLine();

        Consumer<List<String> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, "'" + list.get(i).toUpperCase() + "'");
        };

        System.out.println("This is the original array:");
        PrintInfoClass.printDividerLine();

        String[] stringArray = {
                "interface", "teamwork", "archive", "fellowship", "meetup group"
        };
        UtilitiesClass.printArray(stringArray);
        PrintInfoClass.printDividerLine();

        List<String> listArrayTerms = Arrays.asList(stringArray);

        modify.accept(listArrayTerms);

        System.out.println("This is the modified array:");
        PrintInfoClass.printDividerLine();
        UtilitiesClass.printArray(listArrayTerms.toArray());

        PrintInfoClass.printExerciseExit("Built-in Consumer Interface");
    }
}
