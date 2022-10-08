package labs_examples.multi_threading.experiments;

public class MyFirstRunnable  implements Runnable {
    Thread thread;

    public MyFirstRunnable(String name) {
    thread = new Thread(this, name);
    thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}
