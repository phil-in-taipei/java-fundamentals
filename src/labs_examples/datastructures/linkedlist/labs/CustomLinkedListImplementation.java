package labs_examples.datastructures.linkedlist.labs;

public class CustomLinkedListImplementation<T> {

    private LinkedListNode head;

    public CustomLinkedListImplementation(T... data) {

        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                push(data[i]);
            }
        }
    }

    public void changeHeadData(T data) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
            LinkedListNode iterator = head;
            while (iterator.next != null) {

                iterator = iterator.next;
            }
            head.data = data;
        }
    }

    public boolean contains(T data) {
        boolean containsData = false;
        LinkedListNode iterator = head;
        while (iterator.next != null) {
            if (iterator.data.toString().equals(data)) {
                containsData = true;
            }
            iterator = iterator.next;
        }
        return containsData;
    }

    public void push(T data) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
            LinkedListNode iterator = head;

            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = new LinkedListNode(data);

        }
    }

    public int size() {
        int count = 0;
        LinkedListNode iterator = head;

        // iterate through list
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

    public String toURLString() {
        LinkedListNode iterator = head;
        String output = "localhost:";

        // iterate through list
        while (iterator != null) {
            output += iterator.data + "/";
            iterator = iterator.next;
        }

        return output;
    }
}
