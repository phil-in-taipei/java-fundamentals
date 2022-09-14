package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("This is a 3 X 4 2D array:");
        System.out.println("-------------------------");
        int[][] TwoDArray = new int[3][4];

        for (int i = 0; i < TwoDArray.length; i++) {
            System.out.print("   | ");
            for (int j = 0; j < TwoDArray[i].length; j++) {
                TwoDArray[i][j] = i + j;
                System.out.print(TwoDArray[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }

}
