package labs_examples.multi_threading.experiments;

public class SynchronizedBlockSend extends Thread {
    private String msg;
    private Thread t;
    SynchronizedBlockSender sender;


    // Recieves a message object and a string
    // message to be sent
    SynchronizedBlockSend(String m, SynchronizedBlockSender obj) {
        msg = m;
        sender = obj;
    }
    public void run() {
        // Only one thread can send a message at a time.
        synchronized(sender) {
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}
