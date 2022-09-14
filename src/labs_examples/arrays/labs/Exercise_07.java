package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList();
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("This is an array list:");
        System.out.println("---------------------------------------");

        arrList.add("Let's");
        arrList.add("all");
        arrList.add("get");
        arrList.add("going");
        arrList.add("and");
        arrList.add("have");
        arrList.add("some");
        arrList.add("fun");
        arrList.add("!");


        arrList.remove(1);

        for (String s : arrList) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("This is some info about the array list:");
        System.out.println("---------------------------------------");


        if (!arrList.isEmpty()) {
            System.out.println("This array list has this many items:" + arrList.size());
            System.out.println("---------------------------------------");
            if (arrList.indexOf("!") != -1) {
                System.out.println("This array list has an exclamation mark");
                System.out.println("---------------------------------------");
            } else {
                System.out.println("The array list is does not have an exclamation mark!");
                System.out.println("---------------------------------------");
            }
            if (arrList.contains("fun")) {
                System.out.println("This array list has fun!");
                System.out.println("---------------------------------------");
            } else {
                System.out.println("The array list is does not have fun");
                System.out.println("---------------------------------------");
            }
        } else {
            System.out.println("The array list is empty!");
        }

    }
}
