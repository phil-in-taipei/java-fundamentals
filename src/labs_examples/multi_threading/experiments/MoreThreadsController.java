package labs_examples.multi_threading.experiments;

public class MoreThreadsController {

    public static void main(String[] args) {

        // Step 1) demonstrate creating a new Thread using the MyThread class below
        MyThread thread1 = new MyThread("First Thread");

        // Step 2) demonstrate creating (and starting) a new Thread using the
        // MyOtherThread class below
        MyOtherThread thread2 = new MyOtherThread();
        thread2.start();

    }
}
