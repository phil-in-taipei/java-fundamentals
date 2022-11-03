package labs_examples.datastructures.stack.labs;

public class CustomStackImplementation<T> {
    T[] data;
    private int itemsInStack = 0;
    private int maxItemsInStack = 12;

    CustomStackImplementation(){
        data = (T[]) new Object[maxItemsInStack];
        itemsInStack = 0;
    }

    public boolean isEmpty() {
        return itemsInStack == 0;
    }

    public void doubleStackSize() {
        maxItemsInStack = maxItemsInStack * 2;
        //System.out.println("Double -- items in stack: " + maxItemsInStack);
        PrintInfoClass.printDividerLine();

        T[] newData = (T[]) new Object[maxItemsInStack];
        for (int i = 0; i < itemsInStack; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public T[] getData() {
        return data;
    }

    public int getMaxItemsInStack() {
        return maxItemsInStack;
    }

    public void halveStackSize() {
        maxItemsInStack = maxItemsInStack / 2;
        //System.out.println("Halve -- items in stack: " + maxItemsInStack);
        PrintInfoClass.printDividerLine();

        T[] newData = (T[]) new Object[maxItemsInStack];
        for (int i = 0; i < itemsInStack; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public T peekFirst() throws StackHighOrLowException{
        if (isEmpty()) {
            throw new StackHighOrLowException("The stack is currently empty");
        }
        return data[0];
    }

    public T peekLast() throws StackHighOrLowException{
        if (isEmpty()) {
            throw new StackHighOrLowException("The stack is currently empty");
        }
        return data[itemsInStack - 1];
    }

    public void push(T item) throws StackHighOrLowException{
        // insert item into front of list
        if (itemsInStack == maxItemsInStack) {
            throw new StackHighOrLowException("The stack is currently full");
        }
        data[itemsInStack] = item;
        itemsInStack++;
        if (itemsInStack == 8 & maxItemsInStack == 12) {
            System.out.println("Doubling stack size...");
            doubleStackSize();
        }
    }

    public T pop() throws StackHighOrLowException {
        if (itemsInStack == 0) {
            throw new StackHighOrLowException("The stack is currently empty");
        }
        T item = data[itemsInStack-1];
        data[itemsInStack-1] = null;
        itemsInStack--;
        if (itemsInStack == 3 & maxItemsInStack == 24) {
            halveStackSize();
        }
        return item;
    }

    public void printItemsInStack() {
        for (int i =0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.println("Array index " + i + ": " + data[i]);
            }
        }
    }

    public int size() {
        return itemsInStack;
    }
}

