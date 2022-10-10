package labs_examples.multi_threading.labs;

public class OddNumbersRunnable implements Runnable {

    int stopAtInt; // limit to how many times it will go through the while loop
    NumbersPrintingSynchronizer numbersPrintingSynchronizer;
    public OddNumbersRunnable(
            int stopAtInt,
            NumbersPrintingSynchronizer numbersPrintingSynchronizer) {
        this.stopAtInt = stopAtInt;
        this.numbersPrintingSynchronizer = numbersPrintingSynchronizer;
    }
    @Override
    public void run() { // this will run in the printOddNumber method of the Synchronizer class
        // starts at the first possible odd number
        int oddInt = 1;
        while (oddInt <= stopAtInt) {
            numbersPrintingSynchronizer.printOddNumber(oddInt);
            // changes variable to next odd number (two more)
            oddInt = oddInt + 2;
        }
    }
}
