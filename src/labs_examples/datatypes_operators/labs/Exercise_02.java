package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("Converting int to double:");
        int iVar = 10;
        System.out.println(iVar);
        double dVar = iVar;
        System.out.println(dVar);
        System.out.println(
                "Note: it was widened, and information was gained".toUpperCase()
        );
        System.out.println("-----------------------------------------------");
        System.out.println("Casting double to int:");
        System.out.println(
                "Note: it rounds to the floor".toUpperCase()
        );

        double dVar2 = 10.5;
        System.out.println(dVar2);
        int iVar2 = (int) dVar2;
        System.out.println(iVar2);
        System.out.println(
                "Note: it was narrowed, and information was lost".toUpperCase()
        );
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println(
                "Note: narrowing involves a loss of information".toUpperCase()
        );
        System.out.println("-----------------------------------------------");

    }
}
