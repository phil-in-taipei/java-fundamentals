package labs_examples.datastructures.stack.labs;

public class CustomStackImplementationController {
    public static void main(String[] args) throws Exception {
        CustomStackImplementation<String> stack = new CustomStackImplementation();

        stack.push("Dish1");
        stack.push("Dish2");

        stack.printItemsInStack();
        PrintInfoClass.printDividerLine();
        System.out.println("There are this many items in the stack: " + stack.size());

        PrintInfoClass.printDividerLine();

        String poppedItem = stack.pop();
        System.out.println("This item was removed: " + poppedItem);
        stack.printItemsInStack();
        PrintInfoClass.printDividerLine();

        System.out.println(poppedItem);

        System.out.println("There are this many items in the stack: " + stack.size());
        stack.push("Dish3");
        stack.push("Dish4");
        stack.push("Dish5");
        stack.push("Dish6");
        PrintInfoClass.printDividerLine();

        stack.doubleStackSize();
        stack.printItemsInStack();

        PrintInfoClass.printDividerLine();
        poppedItem = stack.pop();
        System.out.println("This item was removed: " + poppedItem);
        PrintInfoClass.printDividerLine();

        stack.halveStackSize();
        stack.printItemsInStack();

    }
}
