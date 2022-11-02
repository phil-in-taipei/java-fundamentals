package labs_examples.datastructures.stack.experiments;

import java.util.Stack;

public class StackExperiments {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack();

        // push several elements onto the Stack
        myStack.push("Dish1");
        myStack.push("Dish2");
        myStack.push("Dish3");
        myStack.push("Dish4");
        myStack.push("Dish5");

        // print the first element in the Stack
        System.out.println("Peek: " + myStack.peek() + "\n");

        // pop the first element off the Stack
        myStack.pop();

        // print the first element in the Stack again
        System.out.println("Peek: " + myStack.peek() + "\n");

        // demonstrate at least 3 other Stack method
        System.out.println("There are: " + myStack.size() + " items");
        System.out.println("Dish2 is at this index: " + myStack.search("Dish2"));
        System.out.println("The stack is empty: " + myStack.empty());
    }
}
