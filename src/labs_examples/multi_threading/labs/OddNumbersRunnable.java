package labs_examples.multi_threading.labs;

public class OddNumbersRunnable implements Runnable {

    int stopAtInt;
    NumbersPrintingSynchronizer numbersPrintingSynchronizer;
    public OddNumbersRunnable(
            int stopAtInt,
            NumbersPrintingSynchronizer numbersPrintingSynchronizer) {
        this.stopAtInt = stopAtInt;
        this.numbersPrintingSynchronizer = numbersPrintingSynchronizer;
    }
    @Override
    public void run() {
        int oddInt = 1;
        while (oddInt <= stopAtInt) {
            numbersPrintingSynchronizer.printOddNumber(oddInt);
            oddInt = oddInt + 2;
        }
    }
}
