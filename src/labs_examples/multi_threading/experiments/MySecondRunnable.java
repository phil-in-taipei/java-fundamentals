package labs_examples.multi_threading.experiments;

public class MySecondRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(400); // just for example to create a delay
                System.out.println("In " + Thread.currentThread().getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}
