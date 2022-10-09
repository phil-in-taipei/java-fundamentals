package labs_examples.multi_threading.experiments;
import java.util.*;

public class SenderReceiverSenderClass implements Runnable {
    private SenderReceiverData data;
    private static final Random random = new Random();
    static String packets[] = {
            "First packet",
            "Second packet",
            "Third packet",
            "Fourth packet",
            "End"
    };

    public static void main(String[] args) {
        SenderReceiverData data = new SenderReceiverData();
        Thread sender = new Thread(new SenderReceiverSenderClass()); //data
        Thread receiver = new Thread(new SenderReceiverReceiver()); //data

        sender.start();
        receiver.start();
    }

    // standard constructors

    public void run() {


        for (String packet : packets) {
            data.send(packet);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(random.nextInt(5000)); // I added this
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted" + e);
            }
        }
    }

}
