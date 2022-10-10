package labs_examples.multi_threading.labs;

public class SendReceiveMessageSynchronizer {
    private String message;

    // True if ReceiveMessageService should wait
    // False if SendMessageService should wait
    private boolean sendingInProcess = true;

    public synchronized String receive() {
        while (sendingInProcess) {
            try {
                wait(); //wait until next notification that message has been sent
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }

        // sets sendingInProcess to true
        sendingInProcess = true;
        // returns the message, which has been received
        String returnMessage = message;
        notifyAll(); // wakeup other thread(s) -- in this case just send
        return returnMessage;
    }

    public synchronized void send(String message) {
        while (!sendingInProcess) {
            try {
                wait(); //wait until next notification that message has been received or no longer
                        // in process of being sent
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }
        // sets sendingInProcess to false
        sendingInProcess = false;
        // returns the message, which has been sent
        this.message = message;
        notifyAll(); // wakeup other thread(s) -- in this case just receive
    }
}
