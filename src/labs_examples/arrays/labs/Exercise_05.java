package labs_examples.arrays.labs;
import java.util.ArrayList;


import java.util.ArrayList;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("This is an array list of the Alphabet, and printed in reverse order:");
        System.out.println("--------------------------------------------------------------------");
        ArrayList<String> alphabet = new ArrayList<String>();

        // please populate that array or arraylist
        for (char c = 'a'; c <= 'z'; c++) {
            String s = "" + c;
            alphabet.add(s);
        }
        System.out.print("     |");
        for (int i = alphabet.size(); i-- >0;) {
            System.out.print(alphabet.get(i) + "|");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
    }


}
