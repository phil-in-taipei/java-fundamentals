package labs_examples.multi_threading.labs;

import java.util.concurrent.ThreadLocalRandom;

public class SendMessageService implements Runnable {
    private SendReceiveMessageSynchronizer sendReceiveMessageClass;
    String[] messages = SendMessagesStringArrayData.getMessages();

    public SendMessageService(SendReceiveMessageSynchronizer sendReceiveMessageClass) {
        this.sendReceiveMessageClass = sendReceiveMessageClass;
    }

    public void run() {
        String messages[] = this.messages;

        for (String message : messages) {
            if (message.equalsIgnoreCase("terminate")) {
                System.out.println(message.toUpperCase() + ": messages finished");
            } else {
                System.out.println("Sending: " + message);
            }
            sendReceiveMessageClass.send(message);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted" + e.getMessage());
            }
        }
    }
}
