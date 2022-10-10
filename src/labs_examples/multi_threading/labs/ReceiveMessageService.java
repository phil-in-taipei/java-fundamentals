package labs_examples.multi_threading.labs;

import java.util.concurrent.ThreadLocalRandom;

public class ReceiveMessageService implements Runnable {
    private final SendReceiveMessageSynchronizer sendReceiveMessageSynchronizer;

    public ReceiveMessageService(SendReceiveMessageSynchronizer sendReceiveMessageSynchronizer) {
        this.sendReceiveMessageSynchronizer = sendReceiveMessageSynchronizer;
    }

    public void run() {
        // initialize String variable and set as whatever received (null at first?)
        for(String receivedMessage = sendReceiveMessageSynchronizer.receive();
            !"Terminate".equals(receivedMessage); // condition -- not the final "terminate" string of messages array
            receivedMessage = sendReceiveMessageSynchronizer.receive()) { // iteration -- next received message

            System.out.println("Received: " + receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.print("Thread interrupted" + e.toString());
            }
        }
    }
}
