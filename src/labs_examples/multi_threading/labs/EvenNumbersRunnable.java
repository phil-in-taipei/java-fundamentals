package labs_examples.multi_threading.labs;

public class EvenNumbersRunnable implements Runnable {

    int stopAtInt; // limit to how many times it will go through the while loop
    NumbersPrintingSynchronizer numbersPrintingSynchronizer;

    public EvenNumbersRunnable(
            int stopAtInt,
            NumbersPrintingSynchronizer numbersPrintingSynchronizer) {
        this.stopAtInt = stopAtInt;
        this.numbersPrintingSynchronizer = numbersPrintingSynchronizer;
    }
    @Override
    public void run() { // this will run in the printEvenNumber method of the Synchronizer class
        // starts at the first possible even number
        int evenInt = 2;
        while (evenInt <= stopAtInt) {
            numbersPrintingSynchronizer.printEvenNumber(evenInt);
            // changes variable to next even number (two more)
            evenInt = evenInt + 2;
        }
    }
}
