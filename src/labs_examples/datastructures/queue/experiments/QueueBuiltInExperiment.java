package labs_examples.datastructures.queue.experiments;

import java.util.PriorityQueue;

public class QueueBuiltInExperiment {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue();

        // add several elements to the myQueue
        stringQueue.add("beans");
        stringQueue.add("apples");
        stringQueue.add("everclear");
        stringQueue.add("dogfood");
        stringQueue.add("canolaoil");


        // print out every element in this myQueue
        for(String s : stringQueue){
            System.out.println(s);
        }

        // why did they print out in the order they did

        // pop the first element off the myQueue
        String firstItem = stringQueue.remove();
        System.out.println("The first item has been removed: " + firstItem);

        // print out every element again

        for(String s : stringQueue){
            System.out.println(s);
        }

        // demonstrate several other PriorityQueue methods

        String peekItem = stringQueue.peek();

        System.out.println("The first item in the queue: " + peekItem);
        System.out.println("The queue still contains: "
                + stringQueue.contains("beans"));
        System.out.println("This size of the queue is: " + stringQueue.size());
        System.out.println("Now clear the queue");
        stringQueue.clear();
        System.out.print("This size of the queue is: " + stringQueue.size() + "\n");




        PriorityQueue<Integer> intQueue = new PriorityQueue();

        // add several elements to the myQueue
        intQueue.add(30);
        intQueue.add(39);
        intQueue.add(6);
        intQueue.add(2);

        for(Integer i : intQueue){
            System.out.println(i);
        }
    }

}
