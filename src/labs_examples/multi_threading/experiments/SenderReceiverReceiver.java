package labs_examples.multi_threading.experiments;

import java.util.Random;

public class SenderReceiverReceiver implements Runnable{

    private SenderReceiverData load;

    private static final Random random = new Random();

    // standard constructors

    public void run() {
        for(String receivedMessage = load.receive();
            !"End".equals(receivedMessage);
            receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            // ...
            try {
                Thread.sleep(random.nextInt(5000)); // I added this
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted" + e);
            }
        }
    }
}
