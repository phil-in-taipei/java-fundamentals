package labs_examples.enumerations.labs;

import labs_examples.multi_threading.labs.PrintInfoClass;

public class ClassStatusController {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Enum in a Separate Class");
        PrintInfoClass.printDividerLine();
        System.out.println("This will create a class status object and assign an enum variable:");
        PrintInfoClass.printDividerLine();
        ClassStatus firstDay = new ClassStatus(ClassStatusOptions.SCHEDULED);
        System.out.println(firstDay.getStatus());

        PrintInfoClass.printDividerLine();

        firstDay.setStatus(ClassStatusOptions.SAME_DAY_CANCELLATION);
        System.out.println("The is the reassigned enum variable:");
        PrintInfoClass.printDividerLine();
        System.out.println(firstDay.getStatus());
        PrintInfoClass.printExerciseExit("Enum in a Separate Class");
        PrintInfoClass.printDividerLine();
    }
}
