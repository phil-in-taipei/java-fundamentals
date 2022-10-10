package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.experiments.MyThread;

public class ThreadApplication {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Thread Application Example");

        ThreadClass thread1 = new ThreadClass("Basic Thread");
        thread1.setPriority(1);
        //new ThreadClass("Basic Thread");
        PrintInfoClass.printDividerLine();
        ThreadClass thread2 = new ThreadClass("Basic Thread Two");
        thread2.setPriority(10);

        PrintInfoClass.printExerciseExit("Thread Application Example");

        System.out.println("Thread Name Slowly Prints");
        PrintInfoClass.printDividerLine();
    }
}
