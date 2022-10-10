package labs_examples.multi_threading.labs;

public class NumbersPrintingSynchronizer {

    boolean currentlyOddPrinting = false;

    synchronized void printOddNumber(int number) {
        while (currentlyOddPrinting) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + ": " + number);
        currentlyOddPrinting = true;

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            System.out.println("Error in thread: " + e.toString());
        }
        notify();
    }

    synchronized void printEvenNumber(int number) {
        while (!currentlyOddPrinting) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Error in thread: " + e.toString());
            }
        }

        System.out.println(Thread.currentThread().getName() + ": " + number);
        currentlyOddPrinting = false;

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

}
