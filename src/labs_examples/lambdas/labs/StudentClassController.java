package labs_examples.lambdas.labs;

public class StudentClassController {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Constructor Reference");
        PrintInfoClass.printDividerLine();
        System.out.println("Reference to student class constructor to generate new students");
        PrintInfoClass.printDividerLine();

        StudentGenerator userGenerator = StudentClass:: new; // constructor reference
        StudentClass alex = userGenerator.createStudent("Alex", "Chilton");
        StudentClass joey = userGenerator.createStudent("Joey", "Suave");
        System.out.println(alex.toString());
        System.out.println(joey.toString());

        PrintInfoClass.printExerciseExit("Constructor Reference");

    }
}
