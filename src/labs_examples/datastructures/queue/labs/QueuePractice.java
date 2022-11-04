package labs_examples.datastructures.queue.labs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Built-In Queue Class Practice");
        PrintInfoClass.printDividerLine();

        System.out.println("Add 5 items to the queue and print out with iterator:");
        PrintInfoClass.printDividerLine();

        Queue<String> queueObj  = new LinkedList<>();
        queueObj.add("Item1");
        queueObj.add("Item2");
        queueObj.add("Item3");
        queueObj.add("Item4");
        queueObj.add("Item5");

        Iterator iterator = queueObj.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.print("\n");

        PrintInfoClass.printDividerLine();
        boolean itemWasRemoved = queueObj.remove("Item3");
        System.out.println("Using remove function, Item3 was removed: " + itemWasRemoved);
        PrintInfoClass.printDividerLine();

        String topOfQueue = queueObj.peek();
        System.out.println("This is the first item in the queue (using peek): " + topOfQueue);
        PrintInfoClass.printDividerLine();

        boolean containsItem = queueObj.contains("Item3");
        System.out.println("Using contains, see if Item3 is in the queue: : " + containsItem);
        PrintInfoClass.printDividerLine();

        iterator = queueObj.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.print("\n");

        PrintInfoClass.printDividerLine();
        System.out.println("Use clear to remove everything, and make sure queue is empty:");
        PrintInfoClass.printDividerLine();

        queueObj.clear();
        boolean queueIsEmpty = queueObj.isEmpty();
        System.out.println("The queue is now empty: " + queueIsEmpty);
        PrintInfoClass.printDividerLine();

        System.out.println("After adding one item, use size to see number of items:");
        PrintInfoClass.printDividerLine();

        queueObj.add("Item6");
        Integer sizeOfQueue = queueObj.size();
        System.out.println("This is the size of the queue: " + sizeOfQueue);
        PrintInfoClass.printExerciseExit("Built-In Queue Class Practice");
    }
}

