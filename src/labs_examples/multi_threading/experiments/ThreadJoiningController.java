package labs_examples.multi_threading.experiments;

public class ThreadJoiningController {
    public static void main (String[] args) {
        ThreadJoiningExample thrd0 = new ThreadJoiningExample();
        ThreadJoiningExample thrd1 = new ThreadJoiningExample();
        ThreadJoiningExample thrd2 = new ThreadJoiningExample();

        // thread thrd0 starts
        thrd0.start();

        // starts second thread after when first thread "thrd0" has died.
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            thrd0.join();
        } catch(Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }
        // thrd1 starts
        thrd1.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            thrd1.join();
        } catch(Exception ex)  {
            System.out.println("Exception has been  caught" + ex);
        }
        // start thrd2 after when thread thrd1 has died.

        thrd2.start();
    }
}
