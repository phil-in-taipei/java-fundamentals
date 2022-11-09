package labs_examples.datastructures.trees.labs;

public class CustomBSTController {
    public static void main(String[] args) {
        CustomBSTImplementation bst = new CustomBSTImplementation(3, 7, 1, 5, 2, 4, 6);

        System.out.println("Printing Tree contents recursively - inOrder");
        bst.printInorderRecursive(bst.rootNode);
        System.out.println();

        bst.insert(12);
        bst.insert(9);
        bst.printInorderRecursive(bst.rootNode);
        System.out.println();
    }
}
