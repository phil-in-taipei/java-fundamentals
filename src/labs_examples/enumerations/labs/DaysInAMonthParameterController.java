package labs_examples.enumerations.labs;

import labs_examples.multi_threading.labs.PrintInfoClass;

public class DaysInAMonthParameterController {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Parameterized Enum");

        PrintInfoClass.printDividerLine();
        System.out.println("These are the months of the year with number of days:");
        PrintInfoClass.printDividerLine();

        for (DaysInAMonthEnum.Month f : DaysInAMonthEnum.Month.values()) {
            System.out.println(f + " has " + f.getNumberOfDays() + " days");
        }

        PrintInfoClass.printExerciseExit("Parameterized Enum:");
        PrintInfoClass.printDividerLine();
    }
}
