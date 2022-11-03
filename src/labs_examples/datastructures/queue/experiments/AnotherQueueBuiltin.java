package labs_examples.datastructures.queue.experiments;

import java.util.PriorityQueue;

public class AnotherQueueBuiltin {
    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue<String>();

        // add the elements "12", "123" and "1234" elements to the Queue
        myQueue.add("12");
        myQueue.add("123");
        myQueue.add("124");

        // peek at the "top/front" of the Queue

        String topItem = myQueue.peek();
        //System.out.println(topItem);

        // demonstrate contains() method;
        boolean has123 = myQueue.contains("123");
        System.out.println(has123);

        // print the output

        // remove an element from the front of the Queue

        String formerFirstItem = myQueue.remove();

        // print out what you just removed
        System.out.println(formerFirstItem);

        // Retrieve an element, but do not remove, the head of this queue.
        String newTopItem = myQueue.peek();
        System.out.println(newTopItem);

        // print out that element

        // iterate over Queue and print out elements
        for(String s : myQueue){
            System.out.println(s);
        }

        // clear the Queue
        myQueue.clear();
    }
}
