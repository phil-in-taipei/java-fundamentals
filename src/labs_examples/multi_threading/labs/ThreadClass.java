package labs_examples.multi_threading.labs;

public class ThreadClass extends Thread {

    public ThreadClass(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        String threadName = getName();
        System.out.println(getName() + " starting.");
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
