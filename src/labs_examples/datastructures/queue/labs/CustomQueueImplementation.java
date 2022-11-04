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
        //System.out.println("Halve -- items in stack: " + maxItemsInStack);
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
            throw new QueueHighOrLowException("The queue is currently empty");
        }
        return data[itemsInQueue - 1];
    }

    public T peekLast() throws QueueHighOrLowException{
        if (isEmpty()) {
            throw new QueueHighOrLowException("The stack is currently empty");
        }
        return data[0];
    }

    public void printItemsInQueue() {
        for (int i = data.length; i > 0; i--) {
            if (data[i] != null) {
                System.out.println("Array index " + i + ": " + data[i]);
            }
        }
    }

    public int size() {
        return itemsInQueue;
    }
}
