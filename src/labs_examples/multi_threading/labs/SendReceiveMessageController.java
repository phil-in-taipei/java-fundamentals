package labs_examples.multi_threading.labs;

public class SendReceiveMessageController {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Message Synchronizing");
        PrintInfoClass.printDividerLine();

        SendReceiveMessageSynchronizer sendReceiveMessageSynchronizer = new SendReceiveMessageSynchronizer();
        Thread messageSender = new Thread(
                new SendMessageService(sendReceiveMessageSynchronizer)
        );
        Thread messageReceiver = new Thread(
                new ReceiveMessageService(sendReceiveMessageSynchronizer)
        );

        messageSender.start();
        messageReceiver.start();

        PrintInfoClass.printExerciseExit("Message Synchronizing");
    }
}
