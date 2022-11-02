package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Java Built-In Stack Practice");
        PrintInfoClass.printDividerLine();

        Stack<String> stackExample = new Stack();

        System.out.println("First push 4 dishes onto the stack");
        stackExample.push("Dish1");
        stackExample.push("Dish2");
        stackExample.push("Dish3");
        stackExample.push("Dish4");

        PrintInfoClass.printDividerLine();
        System.out.println("Now peek at the top of the stack");
        PrintInfoClass.printDividerLine();

        System.out.println("Peek: " + stackExample.peek());

        PrintInfoClass.printDividerLine();
        System.out.println("Now pop an item off the stack, and peek at the top again:");

        stackExample.pop();
        PrintInfoClass.printDividerLine();
        System.out.println("Peek: " + stackExample.peek());

        PrintInfoClass.printDividerLine();
        System.out.println("Now use the size, search, and empty methods:");
        PrintInfoClass.printDividerLine();

        System.out.println("There are: " + stackExample.size() + " items");
        PrintInfoClass.printDividerLine();

        System.out.println("Dish2 is at this index: " + stackExample.search("Dish2"));
        PrintInfoClass.printDividerLine();

        System.out.println("The stack is empty: " + stackExample.empty());
        PrintInfoClass.printExerciseExit("Java Built-In Stack Practice");


    }
}
