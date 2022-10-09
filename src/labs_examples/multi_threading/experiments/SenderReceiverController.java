package labs_examples.multi_threading.experiments;

public class SenderReceiverController {
    public static void main(String[] args) {
        SenderReceiverData data = new SenderReceiverData();
        Thread sender = new Thread(new SenderReceiverSenderClass()); //data
        Thread receiver = new Thread(new SenderReceiverReceiver()); //data

        sender.start();
        receiver.start();
    }
}
