package labs_examples.datastructures.linkedlist.labs;

public class DoubleLinkedListNode<T> {
    T data;
    DoubleLinkedListNode next, prev;

    public DoubleLinkedListNode(T data) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }

    public DoubleLinkedListNode(T data, DoubleLinkedListNode next, DoubleLinkedListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
