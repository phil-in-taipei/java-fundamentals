package labs_examples.multi_threading.labs;

public class RunnableApplicationSynched {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Runnable Synched");
        PrintInfoClass.printDividerLine();

        RunnableInterface runnable1 = new RunnableInterface();
        Thread thread1 = new Thread(runnable1, "First Runnable Thread");

        RunnableInterface runnable2 = new RunnableInterface();
        Thread thread2 = new Thread(runnable1, "Second Runnable Thread");

        thread1.start();
        try {
            thread1.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

        PrintInfoClass.printDividerLine();
        System.out.println("The Second Thread Waits for the First");
        PrintInfoClass.printDividerLine();
        thread2.start();

        PrintInfoClass.printExerciseExit("Runnable Synched");
        PrintInfoClass.printDividerLine();
        System.out.println("But it takes some more time for it to play out ....");
        PrintInfoClass.printDividerLine();
    }

}
