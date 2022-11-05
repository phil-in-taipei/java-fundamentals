package labs_examples.datastructures.queue.labs;

import labs_examples.datastructures.stack.labs.PrintInfoClass;
import labs_examples.datastructures.stack.labs.StackHighOrLowException;

public class CustomQueueImplementation<T> {
    T[] data;
    private int itemsInQueue = 0;
    private int maxItemsInQueue = 12;

    CustomQueueImplementation(){
        data = (T[]) new Object[maxItemsInQueue];
        itemsInQueue = 0;
    }

    public int getMaxItemsInQueue() {
        return maxItemsInQueue;
    }

    public void add(T item) throws QueueHighOrLowException{
        // insert item into front of list
        if (itemsInQueue == maxItemsInQueue) {
            throw new QueueHighOrLowException("The Queue is currently full");
        }
        data[itemsInQueue] = item;
        itemsInQueue++;
        if (itemsInQueue == 8 & maxItemsInQueue == 12) {
            System.out.println("Doubling stack size...");
            doubleQueueSize();
        }
    }

    public void doubleQueueSize() {
        maxItemsInQueue = maxItemsInQueue * 2;
        //System.out.println("Double -- items in stack: " + maxItemsInStack);
        PrintInfoClass.printDividerLine();

        T[] newData = (T[]) new Object[maxItemsInQueue];
        for (int i = 0; i < itemsInQueue; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void halveQueueSize() {
        maxItemsInQueue = maxItemsInQueue / 2;
        PrintInfoClass.printDividerLine();

        T[] newData = (T[]) new Object[maxItemsInQueue];
        for (int i = 0; i < itemsInQueue; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public boolean isEmpty() {
        return itemsInQueue == 0;
    }

    public T peekFirst() throws QueueHighOrLowException {
        if (isEmpty()) {
            throw new QueueHighOrLowException("The queue is currently empty, so cannot peek at first");
        }
        return data[0];
    }

    public T peekLast() throws QueueHighOrLowException{
        if (isEmpty()) {
            throw new QueueHighOrLowException("The queue is currently empty, so cannot peek at last");
        }
        return data[itemsInQueue - 1];
    }

    public T pop() throws QueueHighOrLowException {
        if (itemsInQueue == 0) {
            throw new QueueHighOrLowException("The queue is currently empty, so item cannot be retrieved");
        }
        T item = data[0];
        for (int i = 0; i < itemsInQueue; i++) {
            data[i] = data[i + 1];
        }
        itemsInQueue--;
        if (itemsInQueue == 3 & maxItemsInQueue == 24) {
            halveQueueSize();
        }
        return item;
    }

    public void printItemsInQueue() {
        for (int i = data.length-1; i >= 0; i--) {
            if (data[i] != null) {
                System.out.println("Array index " + i + ": " + data[i]);
            }
        }
    }

    public int size() {
        return itemsInQueue;
    }
}
