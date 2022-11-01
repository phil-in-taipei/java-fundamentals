package labs_examples.datastructures.linkedlist.labs;

public class CustomLinkedListController {
    public static void main(String[] args) {
        CustomLinkedListImplementation<String> customLinkedList = new CustomLinkedListImplementation(
                "8000/", "FirstItem"
        );

        customLinkedList.push("SecondItem");
        customLinkedList.push("ThirdItem");

        System.out.println("It contains the 'ThirdItem': " + customLinkedList.contains("FirstItem"));


        customLinkedList.changeHeadData("8080");
        System.out.println(customLinkedList.size());
        System.out.println(customLinkedList.toURLString());
    }
}
