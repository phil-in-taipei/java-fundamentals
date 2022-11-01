package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("LinkedList Practice");
        PrintInfoClass.printDividerLine();

        System.out.println("First add values to the linked list via add:");
        LinkedList<String> linkedList = new LinkedList();

        linkedList.add("item0");
        linkedList.add("item1");
        linkedList.add("item2");
        linkedList.add("item3");
        linkedList.add("item4");
        linkedList.add("item5");
        linkedList.add("item6");
        linkedList.add("item7");

        PrintInfoClass.printDividerLine();
        System.out.println("Next add an arrayList of values via addAll:");
        ArrayList<String> arrList = new ArrayList();
        arrList.add("item8");
        arrList.add("item9");
        arrList.add("item10");

        linkedList.addAll(arrList);
        PrintInfoClass.printDividerLine();
        System.out.println("Next add/view an item to beginning via addFirst/getFirst:");
        PrintInfoClass.printDividerLine();

        linkedList.addFirst("item-1");
        System.out.println("The fist item is: " + linkedList.getFirst());
        PrintInfoClass.printDividerLine();

        System.out.println("Next add/view an item to end via addLast/getLast:");
        PrintInfoClass.printDividerLine();
        linkedList.add("item11");
        System.out.println("The last item is: " + linkedList.getLast());
        PrintInfoClass.printDividerLine();

        System.out.println("Remove item that was put on the beginning:");
        PrintInfoClass.printDividerLine();

        linkedList.remove(0);

        System.out.println("Get/set an item:");
        PrintInfoClass.printDividerLine();
        linkedList.set(9, linkedList.get(9).toUpperCase());

        String i9 = linkedList.get(9);
        System.out.println("The 9th item is: " + i9);
        PrintInfoClass.printDividerLine();

        System.out.println("Take off the first item, and put another at the beginning:");
        PrintInfoClass.printDividerLine();
        String firstItem = linkedList.pop();
        System.out.println("After removing the item, the last item is: " + linkedList.getLast());
        PrintInfoClass.printDividerLine();

        System.out.println("The former first item: " + firstItem);
        PrintInfoClass.printDividerLine();

        System.out.println("The LinkedList now contains 'item0': " + linkedList.contains("item0"));
        linkedList.push("itemZero");
        PrintInfoClass.printDividerLine();

        System.out.println("The LinkedList now contains 'itemZero': " + linkedList.contains("itemZero"));
        PrintInfoClass.printDividerLine();

        System.out.println("Now iterate through everything:");
        PrintInfoClass.printDividerLine();

        int count = 0;
        Iterator iter = linkedList.iterator();
        while(iter.hasNext()){
            System.out.println("This is value# " + count + ": " + iter.next());
            count++;
        }


        PrintInfoClass.printExerciseExit("LinkedList Practice");


    }
}
