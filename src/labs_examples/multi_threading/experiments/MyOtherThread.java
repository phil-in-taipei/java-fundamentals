package labs_examples.multi_threading.experiments;

public class MyOtherThread extends Thread {

    @Override
    public void run() {
        System.out.println("I'm in a thread name " + getName() + "!");
    }
}
