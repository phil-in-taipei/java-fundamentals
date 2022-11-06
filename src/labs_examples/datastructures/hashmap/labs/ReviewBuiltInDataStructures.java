package labs_examples.datastructures.hashmap.labs;

import java.util.*;

public class ReviewBuiltInDataStructures {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Review/timing of Built-In Data Structure");
        PrintInfoClass.printDividerLine();

        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;
        String itemString = "Item_";



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

        Queue<Integer> queueObj  = new PriorityQueue<>();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            queueObj.add(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Adding 100 items to Queue took: " + elapsedTime);
        // queueObj.contains("Item3");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            queueObj.contains(i);
        }
        elapsedTime = (new Date()).getTime() - startTime;
        System.out.println("Searching for 100 items in Queue took: " + elapsedTime);

    }
}
