package labs_examples.multi_threading.labs;

public class SendReceiveMessageSynchronizer {
    private String message;

    // True if ReceiveMessageService should wait
    // False if SendMessageService should wait
    private boolean sendingInProcess = true;

    public synchronized String receive() {
        while (sendingInProcess) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }
        sendingInProcess = true;

        String returnMessage = message;
        notifyAll();
        return returnMessage;
    }

    public synchronized void send(String message) {
        while (!sendingInProcess) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }
        sendingInProcess = false;

        this.message = message;
        notifyAll();
    }
}
