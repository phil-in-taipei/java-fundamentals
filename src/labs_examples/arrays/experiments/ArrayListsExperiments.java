package labs_examples.arrays.experiments;
import java.util.ArrayList;


public class ArrayListsExperiments {
    public static void main(String[] args) {
        // please demonstrate how to declare an ArrayList below
        ArrayList<String> arrList = new ArrayList();
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("This is an array list:");
        // please demonstrate how to add values to an array ArrayList
        arrList.add("Let's");
        arrList.add("all");
        arrList.add("get");
        arrList.add("going");
        arrList.add("!");

        // please demonstrate how to remove values from an ArrayList
        arrList.remove(1);

        // please demonstrate how to retrieve values from an ArrayList
        for (String s : arrList) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("This is some info about the array list:");

        // please demonstrate at least two other useful methods available
        // to us when we use ArrayLists
        if (!arrList.isEmpty()) {
            System.out.println("This array list has this many items:" + arrList.size());
        } else {
            System.out.println("The array list is empty!");
        }

        System.out.println("---------------------------------------");
    }
}
