package labs_examples.multi_threading.labs;

public class NumbersPrintingController {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Alternating Odd/Even Printing");
        PrintInfoClass.printDividerLine();

        NumbersPrintingSynchronizer printer = new NumbersPrintingSynchronizer();

        OddNumbersRunnable oddThread = new OddNumbersRunnable(100, printer);
        Thread threadOne = new Thread(oddThread, "Odd Thread");
        threadOne.start();

        EvenNumbersRunnable evenThread = new EvenNumbersRunnable(100, printer);
        Thread threadTwo = new Thread(evenThread, "Even Thread");
        threadTwo.start();

        PrintInfoClass.printExerciseExit("Alternating Odd/Even Printing");
    }
}
