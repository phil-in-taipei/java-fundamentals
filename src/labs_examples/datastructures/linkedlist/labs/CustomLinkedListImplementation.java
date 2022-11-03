package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

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
     public void prependHeadData(T data) {
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void changeHeadData(T data) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
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

    // removes list item following the item with the passed in data
    public void removeURLKey(T data) {
        LinkedListNode iterator = head;

        //Check if data is in the head
        //if so, remove (set head to iterator.next)
        if (iterator.data == data) {
            head = iterator.next;
        } else {
            // iterate to find node with the data
            while (iterator.next != null && iterator.data != data) {
                iterator = iterator.next;
            }
            //data wasn't in any of the nodes (it's at the end)
            if (iterator.next == null) {
                return;
            }else {
                //found the data; check position and delete
                if (iterator.next.next == null){ //end of the list; remove last node
                    System.out.println("Last item follows:" +  " " + data);
                    iterator.next = null;
                    //return;
                }else {
                    //between head and last item; delete (connect with node following the deleted node)
                    System.out.println("Not last item follows:" +  " " + data);
                    iterator.next = iterator.next.next;
                }
            }
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
