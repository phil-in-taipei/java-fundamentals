package labs_examples.datastructures.stack.labs;

public class CustomStackImplementation<T> {
    T[] data;
    private int itemsInStack = 0;
    private int maxItemsInStack = 12;

    CustomStackImplementation(){
        data = (T[]) new Object[maxItemsInStack];
        itemsInStack = 0;
    }

    public void doubleStackSize() {
        maxItemsInStack = maxItemsInStack * 2;
        System.out.println("Maximum number of items in stack: " + maxItemsInStack);
        PrintInfoClass.printDividerLine();

        T[] newData = (T[]) new Object[maxItemsInStack];
        for (int i = 0; i < itemsInStack; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void halveStackSize() {
        maxItemsInStack = maxItemsInStack / 2;
        System.out.println("Maximum number of items in stack: " + maxItemsInStack);
        PrintInfoClass.printDividerLine();

        T[] newData = (T[]) new Object[maxItemsInStack];
        for (int i = 0; i < itemsInStack; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void push(T item) {
        // insert item into front of list
        data[itemsInStack] = item;
        itemsInStack++;
        //System.out.println("The are this many items in the stack: " + itemsInStack);
        //for (int i = 1; i < itemsInStack; i++) {
        //    data[i] = data [i-1];
        //}
        //data[0] = item;
    }

    public T pop() throws Exception {
        if (itemsInStack == 0) {
            throw new Exception("Stack empty");
        }
        T item = data[itemsInStack-1];
        data[itemsInStack-1] = null;
        itemsInStack--;

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

