package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

public class LinkedListNode<T> {
    T data;
    // a "link" to the "next" Node in the LinkedList
    LinkedListNode next;

    // a simple constructor that takes in data
    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }

    // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public LinkedListNode(T data, LinkedListNode node) {
        this.data = data;
        this.next = node;

    }
}
