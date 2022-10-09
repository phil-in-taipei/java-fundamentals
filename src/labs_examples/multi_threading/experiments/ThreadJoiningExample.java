package labs_examples.multi_threading.experiments;

public class ThreadJoiningExample extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500); // delay just for example
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch(Exception ex) {
                System.out.println("Exception has been caught" + ex);
            }
            System.out.println(i);
        }
    }
}
