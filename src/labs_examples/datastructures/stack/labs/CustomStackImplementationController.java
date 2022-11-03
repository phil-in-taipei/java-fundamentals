package labs_examples.datastructures.stack.labs;

public class CustomStackImplementationController {
    public static void main(String[] args) throws Exception {

        PrintInfoClass.printExerciseIntro("Stack Custom Implementation");
        CustomStackImplementation<String> stack = new CustomStackImplementation();
        PrintInfoClass.printDividerLine();

        System.out.println("Add some items using push:");
        PrintInfoClass.printDividerLine();

        stack.push("Dish1");
        stack.push("Dish2");

        stack.printItemsInStack();
        PrintInfoClass.printDividerLine();
        System.out.println("There are this many items in the stack: " + stack.size());

        PrintInfoClass.printDividerLine();
        System.out.println("Remove items using pop:");
        PrintInfoClass.printDividerLine();

        String poppedItem = stack.pop();
        System.out.println("This item was removed: " + poppedItem);
        stack.printItemsInStack();
        PrintInfoClass.printDividerLine();

        System.out.println("There are this many items in the stack: " + stack.size());
        PrintInfoClass.printDividerLine();
        System.out.println("Add some more items using push, and show max number in stack:");
        PrintInfoClass.printDividerLine();
        stack.push("Dish3");
        System.out.println("The last item in the stack is: " + stack.peekLast());
        stack.push("Dish4");
        System.out.println("The last item in the stack is: " + stack.peekLast());
        stack.push("Dish5");
        System.out.println("The last item in the stack is: " + stack.peekLast());
        stack.push("Dish6");
        System.out.println("The last item in the stack is: " + stack.peekLast());
        System.out.println("Max number: " + stack.getMaxItemsInStack());
        PrintInfoClass.printDividerLine();

        System.out.println("After the stack is half full (12), the size will double:");
        PrintInfoClass.printDividerLine();

        stack.push("Dish9");
        System.out.println("Stack size: " + stack.size());
        System.out.println("Max number: " + stack.getMaxItemsInStack());
        PrintInfoClass.printDividerLine();

        stack.push("Dish10");
        System.out.println("Stack size: " + stack.size());
        System.out.println("Max number: " + stack.getMaxItemsInStack());
        PrintInfoClass.printDividerLine();

        stack.push("Dish11");
        System.out.println("Stack size: " + stack.size());
        System.out.println("Max number: " + stack.getMaxItemsInStack());
        PrintInfoClass.printDividerLine();

        stack.push("Dish12");
        System.out.println("Stack size: " + stack.size());
        System.out.println("Max number: " + stack.getMaxItemsInStack());

        PrintInfoClass.printDividerLine();

        stack.printItemsInStack();

        PrintInfoClass.printDividerLine();
        poppedItem = stack.pop();
        System.out.println("This item was removed: " + poppedItem);
        PrintInfoClass.printDividerLine();

        System.out.println("The first item in the stack is: " + stack.peekFirst());
        System.out.println("The last item in the stack is: " + stack.peekLast());
        System.out.println("Max items: " + stack.getMaxItemsInStack());

        PrintInfoClass.printExerciseExit("Stack Custom Implementation");

    }
}
