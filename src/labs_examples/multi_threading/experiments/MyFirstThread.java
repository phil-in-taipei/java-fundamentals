package labs_examples.multi_threading.experiments;

public class MyFirstThread extends Thread {
    // Constructor for MyFirstThread
    MyFirstThread(String name) {
        // pass the name of the thread to the super constructor
        super(name);
        // start the thread
        start();
    }
    // run() is called automatically after start() - this is overridden from the parent Thread class
    // the code in the run() method is what will be run as an independent thread
    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 5; count++) {
                Thread.sleep(400); // this is just to put an artificial delay in the example
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
