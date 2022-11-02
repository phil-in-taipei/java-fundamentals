package labs_examples.datastructures.linkedlist.labs;

public class CustomDoubleLinkedListController {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Custom Double Linked List");

        CustomDoubleLinkedListImplementation list = new CustomDoubleLinkedListImplementation();
        System.out.println("Insert items at the beginning");
        PrintInfoClass.printDividerLine();

        list.insertAtBeginning("FirstItem");
        list.insertAtBeginning("SecondItem");
        list.printDataOfAllItems();

        PrintInfoClass.printDividerLine();

        System.out.println("Insert item at end (different type)");
        PrintInfoClass.printDividerLine();

        list.insertAtEnd(2);
        list.printDataOfAllItems();

        PrintInfoClass.printDividerLine();
        System.out.println("Insert at Indexes (2, 1, and 4)");
        PrintInfoClass.printDividerLine();

        list.insertAtIndex("FourthItem", 2);
        list.printDataOfAllItems();
        PrintInfoClass.printDividerLine();

        list.insertAtIndex("FifthItem", 1);
        list.printDataOfAllItems();
        PrintInfoClass.printDividerLine();

        list.insertAtIndex("SixthItem", 4);
        list.printDataOfAllItems();

        PrintInfoClass.printDividerLine();
        System.out.println("Delete item at index 3");
        PrintInfoClass.printDividerLine();

        list.deleteAtIndex(3);
        list.printDataOfAllItems();



        PrintInfoClass.printExerciseExit("Custom Double Linked List");
    }
}
