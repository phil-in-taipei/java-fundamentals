package labs_examples.static_nonstatic.labs;

public class PrintInfoClass {

    static String BLACK_TEXT = "\u001B[30m";
    static String WHITE_BACKGROUND = "\u001B[47m";
    static String STANDARD_FORMAT = "\u001B[0m";



    public static void printDividerLine() {
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void printExerciseIntro() {
        printDividerLine();
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        " -- This is the beginning of the static/non-static labs exercise -- "
                        + STANDARD_FORMAT
        );
    }

    public static void printExerciseExit() {
        printDividerLine();
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        " -- This is the ending of the static/non-static labs exercise -- "
                        + STANDARD_FORMAT
        );
    }
}
