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
        ArrayList<String> list = new ArrayList<String>(10) ;
        list.add( "Ana" );

        list.add( "Bob" );
        list.add( "Cathy" );
        list.add( 0, "Eric" );
        System.out.println(list.get(2));

        // please declare an array or arraylist below
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("This is an array list of the Alphabet:");
        System.out.println("--------------------------------------");
        ArrayList<String> alphabet = new ArrayList<String>();

        // please populate that array or arraylist
        for (char c = 'a'; c <= 'z'; c++) {
            String s = "" + c;
            alphabet.add(s);
        }
        // please use a For Each Loop to print each element
        // in the array or arraylist you declared and populated above
        int index = 1;
        for (String s : alphabet) {
            System.out.println("Item " + index + " in the list is: " + s);
            index++;
        }

        System.out.println("--------------------------------------");
        System.out.println("OK, done!");
        System.out.println("--------------------------------------");

        //YOUR CODE BELOW

        /*  1.  First create and initialize an ArrayList called guests.
                Remember, the syntax to create an ArrayList is:
                ArrayList<type> name = new ArrayList<type>();   */
        ArrayList<String> guests = new ArrayList<String>();

        /*  2.  Now add the following names to the list using .add() :
                Arnold, Gerald, Eugene, Helga, Phoebe in that order */
        guests.add("Arnold");
        guests.add("Gerald");
        guests.add("Eugene");
        guests.add("Helga");
        guests.add("Phoebe");


        /*  3.  Print the names using a ForEach loop.
                Remember, the syntax for the ForEach loop is:
                for(type element: collection) { code }          */
        for (String guest: guests) {
            System.out.println(guest);
        }

        /*  4.  Eugene wont be able to make it.
                Remove him from the list using .remove() */
        guests.remove("Eugene");

        /*  5. Print the list again  */
        System.out.print("| ");
        for (String guest: guests) {
            System.out.print(guest + " | ");
        }


        //YOUR CODE ABOVE

    }
}
