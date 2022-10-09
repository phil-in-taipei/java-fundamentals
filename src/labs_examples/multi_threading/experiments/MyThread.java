package labs_examples.multi_threading.experiments;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println("I'm in a thread name " + getName() + "!");
    }
}
