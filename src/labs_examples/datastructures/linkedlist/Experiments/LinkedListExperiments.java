package labs_examples.datastructures.linkedlist.Experiments;

import java.util.LinkedList;

public class LinkedListExperiments {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();

        // demonstrate adding several elements to the LinkedList
        myList.add("item0");
        myList.add("item1");
        myList.add("item2");
        myList.add("item3");
        myList.add("item4");
        myList.add("item5");
        myList.add("item6");
        myList.add("item7");

        // demonstrate retrieving one or more element from the LinkedList
        String i2 = myList.get(2);
        System.out.println("The 2nd item is: " + i2);

        // demonstrate removing several elements from the LinkedList
        myList.remove(5);
        myList.pop();

        // demonstrate at least 4 additional method calls against the LinkedList
        myList.push("item-1");
        System.out.println(myList.peekLast());
        System.out.println(myList.peekFirst());
        System.out.println("item3 is at index: " + myList.indexOf("item3"));

    }
}
