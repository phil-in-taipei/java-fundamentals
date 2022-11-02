package labs_examples.datastructures.linkedlist.labs;

public class CustomLinkedListController {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Custom Linked List as URL path");
        PrintInfoClass.printDividerLine();
        System.out.println("Initialize the custom linked list:");
        CustomLinkedListImplementation<String> customLinkedList = new CustomLinkedListImplementation(
                "8000", "FirstItem"
        );
        PrintInfoClass.printDividerLine();
        System.out.println(customLinkedList.toURLString());
        PrintInfoClass.printDividerLine();

        System.out.println("Add more items, and check if added:");

        customLinkedList.push("SecondItem");
        customLinkedList.push("xy3M24x8");
        customLinkedList.push("ThirdItem");
        PrintInfoClass.printDividerLine();
        System.out.println(
                "It contains the 'ThirdItem': "
                + customLinkedList.contains("FirstItem")
        );

        PrintInfoClass.printDividerLine();
        System.out.println(customLinkedList.toURLString());
        PrintInfoClass.printDividerLine();

        System.out.println("Change first item:");
        customLinkedList.changeHeadData("ZeroItem");

        PrintInfoClass.printDividerLine();

        System.out.println("Prepend the list with another port:");
        PrintInfoClass.printDividerLine();

        customLinkedList.prependHeadData("8080");
        System.out.println(customLinkedList.toURLString());
        PrintInfoClass.printDividerLine();

        System.out.println("Check size and set size as a primary key in url:");
        PrintInfoClass.printDividerLine();

        String primaryKey = String.valueOf(customLinkedList.size());
        customLinkedList.push(primaryKey);
        System.out.println(customLinkedList.toURLString());
        PrintInfoClass.printDividerLine();

        System.out.println("Remove keys in url, but passing in prior content:");
        PrintInfoClass.printDividerLine();

        System.out.println(customLinkedList.toURLString());
        customLinkedList.removeURLKey("SecondItem");
        PrintInfoClass.printDividerLine();

        System.out.println(customLinkedList.toURLString());
        PrintInfoClass.printDividerLine();
        
        customLinkedList.removeURLKey("ThirdItem");
        System.out.println(customLinkedList.toURLString());
        PrintInfoClass.printDividerLine();
        customLinkedList.removeURLKey("ThirdItdkdslem");

        System.out.println(customLinkedList.toURLString());

        PrintInfoClass.printDividerLine();
        customLinkedList.removeURLKey("SecondItem");
        System.out.println(customLinkedList.toURLString());

        PrintInfoClass.printExerciseExit("Custom Linked List as URL path");

    }
}
