package labs_examples.multi_threading.labs;

import java.util.concurrent.ThreadLocalRandom;

public class ReceiveMessageService implements Runnable {
    private SendReceiveMessageSynchronizer sendReceiveMessageClass;

    public ReceiveMessageService(SendReceiveMessageSynchronizer sendReceiveMessageClass) {
        this.sendReceiveMessageClass = sendReceiveMessageClass;
    }

    public void run() {
        for(String receivedMessage = sendReceiveMessageClass.receive(); // initialize
            !"Terminate".equals(receivedMessage); // condition
            receivedMessage = sendReceiveMessageClass.receive()) { // iteration

            System.out.println("Received: " + receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                //Log.error("Thread interrupted", e);
                System.out.print("Thread interrupted" + e.toString());
            }
        }
    }
}
