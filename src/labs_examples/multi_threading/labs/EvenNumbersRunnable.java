package labs_examples.multi_threading.labs;

public class EvenNumbersRunnable implements Runnable {

    int stopAtInt;
    NumbersPrintingSynchronizer numbersPrintingSynchronizer;

    public EvenNumbersRunnable(
            int stopAtInt,
            NumbersPrintingSynchronizer numbersPrintingSynchronizer) {
        this.stopAtInt = stopAtInt;
        this.numbersPrintingSynchronizer = numbersPrintingSynchronizer;
    }
    @Override
    public void run() {
        int evenInt = 2;
        while (evenInt <= stopAtInt) {
            numbersPrintingSynchronizer.printEvenNumber(evenInt);
            evenInt = evenInt + 2;
        }
    }
}
