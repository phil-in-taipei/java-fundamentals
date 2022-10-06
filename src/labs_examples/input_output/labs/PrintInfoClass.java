package labs_examples.input_output.labs;

public class PrintInfoClass {

    static String BLACK_TEXT = "\u001B[30m";
    static String WHITE_BACKGROUND = "\u001B[47m";
    static String STANDARD_FORMAT = "\u001B[0m";



    public static void printDividerLine() {
            System.out.println("-----------------------------------------------------------------------------");
    }

    public static void printExerciseIntro(String introString) {
        System.out.println("\n");
        printDividerLine();
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        introString
                        + STANDARD_FORMAT
        );
    }

    public static void printExerciseExit(String exitString) {
        printDividerLine();
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        exitString
                        + STANDARD_FORMAT
        );
    }

}

