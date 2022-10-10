package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.experiments.MySecondRunnable;

public class RunnableImplement2WaysController {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Runnable Implementations");
        PrintInfoClass.printDividerLine();

        RunnableInterface runnable1 = new RunnableInterface();
        Thread thread1 = new Thread(runnable1, "First Multi-Line Way");
        thread1.start();

        PrintInfoClass.printDividerLine();

        new Thread(new RunnableInterface(),
                "Second One-Line Way")
                .start();

        PrintInfoClass.printExerciseExit("Runnable Implementations");

        PrintInfoClass.printDividerLine();
        System.out.println("Fun Garble Ensues Asynchronously :)");


    }

}
