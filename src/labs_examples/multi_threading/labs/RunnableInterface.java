package labs_examples.multi_threading.labs;

public class RunnableInterface implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getName() + " starting.");
        try {
            for(int i=0; i < threadName.length(); i++) {
                Thread.sleep(200);
                System.out.print(threadName.charAt(i));
            }
           System.out.println("\n");
        }
        catch(InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}

