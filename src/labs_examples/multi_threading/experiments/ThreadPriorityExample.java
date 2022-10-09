package labs_examples.multi_threading.experiments;

public class ThreadPriorityExample implements Runnable {

    int count;
    /* create the Thread object that will manage the thread */
    Thread thrd;
    static boolean stop = false;
    static String currentName;
    int id = 0;
    /* Construct a new thread. Notice that this
       constructor does not actually start the
       threads running. */
    ThreadPriorityExample(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
        /* Notice that we do not start the thread in the constructor this time.
           The choice is yours. If you do not start the thread (thrd.start()) here in the constructor,
           then you must manually start it from the controlling class.
           See "mt1.thrd.start();" in the PriorityDemo class below */
    }

    /* Begin execution of new thread. */
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 1000);
        stop = true;
        System.out.println("\n" + thrd.getName() +
                " terminating.");
    }
}
