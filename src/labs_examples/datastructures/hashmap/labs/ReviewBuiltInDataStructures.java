package labs_examples.datastructures.hashmap.labs;

import java.util.*;

public class ReviewBuiltInDataStructures {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Review/timing of Built-In Data Structure");
        PrintInfoClass.printDividerLine();

        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;


        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("AddIng 100 items in LinkedList took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.set(i, i + 1);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Updating 100 items in LinkedList took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.get(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Get 100 items in LinkedList took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.remove();
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Removing 100 items in LinkedList took: " + elapsedTime);
        PrintInfoClass.printDividerLine();

        Stack<Integer> stackExample = new Stack();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stackExample.add(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Adding 100 items to Stack took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stackExample.get(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Searching for 100 items in Stack took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stackExample.set(i, i + 1);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Updating 100 items to Stack took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stackExample.pop();
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Removing 100 items to Stack took: " + elapsedTime);
        PrintInfoClass.printDividerLine();

        startTime = System.currentTimeMillis();
        Queue<Integer> queueObj  = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            queueObj.add(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Adding 100 items to Queue took: " + elapsedTime);
        // queueObj.contains("Item3");

        startTime = System.currentTimeMillis();
        Queue<Integer> copyOfQueue = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            int removedItem = queueObj.remove();
            //System.out.println("Removed: " + removedItem);
            copyOfQueue.add(removedItem + 1);
        }

        queueObj = copyOfQueue;
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Updating 100 items in Queue took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 1; i < 101; i++) {
            Iterator iter = queueObj.iterator();
            while (iter.hasNext()) {
                if ((int)iter.next() == i) {
                    //System.out.println("Queue item found at index: " + i);
                    break;
                }
            }
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Searching for 100 items in Queue took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            queueObj.remove();
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Removing 100 items from Queue took: " + elapsedTime);
        PrintInfoClass.printDividerLine();

        HashMap<Integer, String> hashMapObj = new HashMap();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hashMapObj.put(i, Integer.toString(i));
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Adding 100 items to HashMap took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hashMapObj.get(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Searching for 100 items in HashMap took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hashMapObj.replace(i, Integer.toString(i + 1));
        }
        elapsedTime = (new Date()).getTime() - startTime;

        System.out.println("Updating 100 items in HashMap took: " + elapsedTime);

        startTime = System.currentTimeMillis();
        hashMapObj.clear();
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Deleting 100 items from HashMap took: " + elapsedTime);

        PrintInfoClass.printExerciseExit("Review/timing of Built-In Data Structure");

    }
}
