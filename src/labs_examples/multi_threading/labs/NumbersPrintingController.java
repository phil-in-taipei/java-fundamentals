package labs_examples.multi_threading.labs;

public class NumbersPrintingController {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Odd/Even Printing");
        PrintInfoClass.printDividerLine();

        NumbersPrintingSynchronizer numbersPrintingSynchronizer = new NumbersPrintingSynchronizer();

        OddNumbersRunnable oddThread = new OddNumbersRunnable(
                100, numbersPrintingSynchronizer
        );
        Thread threadOne = new Thread(oddThread, "Odd Thread");
        threadOne.start();

        EvenNumbersRunnable evenThread = new EvenNumbersRunnable(
                100, numbersPrintingSynchronizer
        );
        Thread threadTwo = new Thread(evenThread, "Even Thread");
        threadTwo.start();

        PrintInfoClass.printExerciseExit("Alternating Odd/Even Printing");
    }
}
