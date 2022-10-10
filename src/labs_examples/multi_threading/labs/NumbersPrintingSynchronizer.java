package labs_examples.multi_threading.labs;

public class NumbersPrintingSynchronizer {

    boolean currentlyOddPrinting = false; // the state of what type of odd/even printing

    // alternates with an off/on boolean corresponding to state
    // if it is odd, it does the first "printOddNumber" method
    // if it is even, it does the second "printEvenNumber" method

    synchronized void printOddNumber(int number) {
        // the odd thread will sync with this method
        while (currentlyOddPrinting) {
            try {
                wait(); //wait until next notification that odd number switch is on
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // prints the odd thread name and next odd number
        // sets currentlyOddPrinting state to true
        System.out.println(Thread.currentThread().getName() + ": " + number);
        currentlyOddPrinting = true;

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            System.out.println("Error in thread: " + e.toString());
        }
        notify(); // wakeup even thread
    }

    synchronized void printEvenNumber(int number) {
        // the even thread will sync with this method
        while (!currentlyOddPrinting) {
            try {
                wait(); //wait until next notification that odd number switch is off
            }
            catch (InterruptedException e) {
                System.out.println("Error in thread: " + e.toString());
            }
        }
        // prints the even thread name and next even number
        // sets currentlyOddPrinting state to false
        System.out.println(Thread.currentThread().getName() + ": " + number);
        currentlyOddPrinting = false;

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify(); // wakeup odd thread
    }

}
