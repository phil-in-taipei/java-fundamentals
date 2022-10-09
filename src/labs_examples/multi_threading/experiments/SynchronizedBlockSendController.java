package labs_examples.multi_threading.experiments;

public class SynchronizedBlockSendController {
    public static void main(String args[])  {
        SynchronizedBlockSender snd = new SynchronizedBlockSender();
        SynchronizedBlockSend s1 = new SynchronizedBlockSend( " Hi " , snd );
        SynchronizedBlockSend s2 = new SynchronizedBlockSend( " Bye " , snd );
        // Start two threads of ThreadedSend type
        s1.start();
        s2.start();


        // wait for threads to end
        try {
            s1.join();
            s2.join();
        } catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}
