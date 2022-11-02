package labs_examples.datastructures.linkedlist.labs;

public class CustomDoubleLinkedListImplementation<T> {
    protected DoubleLinkedListNode startNode;
    protected DoubleLinkedListNode endNode;
    public int length;

    public CustomDoubleLinkedListImplementation() {
        startNode = null;
        endNode = null;
        length = 0;
    }


    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (length == 1) {
                startNode = null;
                endNode = null;
                length = 0;
                return;
            }
            startNode = startNode.next;
            startNode.prev = null;
            length--;
            return;
        }
        if (index == length) {
            endNode = endNode.prev;
            endNode.next = null;
            length--;
        }
        DoubleLinkedListNode pointerNode = startNode.next;
        for (int i = 1; i <= length; i++) {
            if (i == index) {
                DoubleLinkedListNode previous = pointerNode.prev;
                DoubleLinkedListNode next = pointerNode.next;

                previous.next = next;
                next.prev = previous;
                length--;
                return;
            }
            pointerNode = pointerNode.next;
        }
    }

    public void insertAtBeginning (T data) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(data, null, null);
        if (startNode == null) {
            startNode = newNode;
            endNode = startNode;
        } else {
            startNode.prev = newNode;
            newNode.next = startNode;
            startNode = newNode;
        }
        length++;
    }

    public void insertAtEnd(T data) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(data, null, null);
        if (startNode == null) {
            startNode = newNode;
            endNode = startNode;
        } else {
            newNode.prev = endNode;
            endNode.next = newNode;
            endNode = newNode;
        }
        length++;
    }

    public void insertAtIndex(T data, int index) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(data, null, null);
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        DoubleLinkedListNode pointerNode = startNode;
        for (int i = 1; i <= length; i++) {
            if (i == index) {
                DoubleLinkedListNode temporaryNode = pointerNode.next;
                pointerNode.next = newNode;
                newNode.prev = pointerNode;
                newNode.next = temporaryNode;
                temporaryNode.prev = newNode;
            }
            pointerNode = pointerNode.next;
        }
        length++;
    }

    public boolean isEmpty() {
        return startNode == null;
    }

    public int getLength() {
        return length;
    }

    public void printDataOfAllItems() {
        System.out.print("Double Linked List: ");
        if (length == 0) {
            System.out.print("empty\n");
            return;
        }
        if (startNode.next == null) {
            System.out.println(startNode.data);
            return;
        }
        DoubleLinkedListNode pointerNode = startNode;
        System.out.print(startNode.data + ", ");
        pointerNode = startNode.next;
        while (pointerNode.next != null) {
            System.out.print(pointerNode.data + ", ");
            pointerNode = pointerNode.next;
        }
        System.out.print(pointerNode.data + "\n");
    }
}
