package labs_examples.multi_threading.experiments;
import java.util.Random;

public class LoopExperiment {
    public static void main(String[] args) throws InterruptedException {
        String helloWorld = "Hello World!!";
        for (int i = 0; i < helloWorld.length(); i++) {
            if (i % 2 == 0) {
                char c = helloWorld.charAt(i);
                String s = "" + c;
                System.out.print(s.toUpperCase());
            } else {
                char c = helloWorld.charAt(i);
                String s = "" + c;
                System.out.print(s);
            }
            try{
                Thread.sleep(200);
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("");

        boolean val1 = false;
        boolean val2 = true;
        if (val1) {
            System.out.println("one");
        } else if (val2) {
            System.out.println("two");
        } else {
            System.out.println("three");
        }
        if (val1 && val2) {
            System.out.println("four");
        } else if (val1 || val2) {
            System.out.println("five");
        } else if (val1 ^ val2) {
            System.out.println("six");
        } else {
            System.out.println("seven");
        }

        System.out.println("--------------------------------------------------");
        Random rand = new Random();
        int handValue = rand.nextInt(53);
        //int handValue = 16;
        System.out.println("Value is " + handValue);
        if (handValue <= 16) {
            System.out.println("Sit");
        } else {
            System.out.println("Stand");
        }


    }
}
