package labs_examples.datastructures.queue.labs;

public class CustomQueueImplementationController {
    public static void main(String[] args) throws QueueHighOrLowException {

        PrintInfoClass.printExerciseIntro("Custom Queue");

        CustomQueueImplementation<String> queue = new CustomQueueImplementation<>();
        PrintInfoClass.printDividerLine();
        System.out.println("This is the size of the queue: " + queue.size());
        PrintInfoClass.printDividerLine();

        System.out.println("This is the maximum size of the queue: " + queue.getMaxItemsInQueue());
        PrintInfoClass.printDividerLine();

        System.out.println("Add 14 items using push (will double queue size):");
        PrintInfoClass.printDividerLine();
        queue.add("Dish1");
        queue.add("Dish2");
        queue.add("Dish3");
        queue.add("Dish4");
        queue.add("Dish5");
        queue.add("Dish6");
        queue.add("Dish7");
        queue.add("Dish8");
        queue.add("Dish9");
        queue.add("Dish10");
        queue.add("Dish11");
        queue.add("Dish12");
        queue.add("Dish13");
        queue.add("Dish14");

        System.out.println("This is the size of the queue: " + queue.size());
        PrintInfoClass.printDividerLine();

        System.out.println("This is the maximum size of the queue: " + queue.getMaxItemsInQueue());
        PrintInfoClass.printDividerLine();

        System.out.println("This is first item in the queue: " + queue.peekFirst());
        PrintInfoClass.printDividerLine();

        System.out.println("This is last item in the queue: " + queue.peekLast());
        PrintInfoClass.printDividerLine();

        System.out.println("These are the items in the queue:");
        PrintInfoClass.printDividerLine();
        queue.printItemsInQueue();
        PrintInfoClass.printDividerLine();

        System.out.println("Now pop several items off the front of the line:");
        PrintInfoClass.printDividerLine();

        String poppedItem = queue.pop();
        for (int i = 0; i < 10; i++) {
            System.out.println("Just removed: " + poppedItem);
            poppedItem = queue.pop();
        }


        System.out.println("This item was received: " + poppedItem);
        PrintInfoClass.printDividerLine();
        System.out.println("This is the size of the queue: " + queue.size());
        PrintInfoClass.printDividerLine();

        System.out.println("These are the items in the queue:");
        PrintInfoClass.printDividerLine();
        queue.printItemsInQueue();
        PrintInfoClass.printDividerLine();


        System.out.println("This is the maximum size of the queue: " + queue.getMaxItemsInQueue());
        PrintInfoClass.printDividerLine();

        System.out.println("This is first item in the queue: " + queue.peekFirst());
        PrintInfoClass.printDividerLine();

        System.out.println("This is last item in the queue: " + queue.peekLast());
        PrintInfoClass.printExerciseExit("Custom Queue");

    }
}
