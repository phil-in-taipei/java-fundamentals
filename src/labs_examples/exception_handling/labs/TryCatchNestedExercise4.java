package labs_examples.exception_handling.labs;
import java.util.Random;

public class TryCatchNestedExercise4 {

    static Random random = new Random();

    static String[] nameArray = { "Matty", "Dave", "Laura", "Leslie" };
    static int[] intArray = { 1092810320, 50, 42, 0, 2, 249, 0};
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        System.out.println("Nested try/catch example:");

        System.out.println("--------------------------------------------------");
        System.out.println("**************************************************");

        for (int i = 0; i < intArray.length; i++) {
            try {
                int divideBy = i / intArray[i];
                System.out.println("--------------------------------------------------");
                System.out.println("Dividing index by integer at that index");
                System.out.println("--------------------------------------------------");
                System.out.println(divideBy);
            } catch (ArithmeticException  exc) {
                System.out.println("--------------------------------------------------");
                System.out.println("Integer at that index was zero");
                System.out.println(exc.toString());
                System.out.println("--------------------------------------------------");
                System.out.println(exc.toString());
                try {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Name at that index (where the error occurred was: ");
                    System.out.println(nameArray[i]);
                } catch(IndexOutOfBoundsException exception) {
                    System.out.println(exception.toString());
                }
            }
            System.out.println("--------------------------------------------------");
        }

        //for (int i = 0; i < nameArray.length; i++) {
        //    boolean nameOption = random.nextBoolean();
        //    if (nameOption) {
        //        System.out.println(returnArrayItem(nameArray[i]));

        //    } else {
        //        System.out.println(returnArrayItem(intArray[i]));
        //    }
        //}

    }

    static String returnArrayItem(String arrayItem) {
        return arrayItem;
    }

    static int returnArrayItem(int arrayItem) {
        return arrayItem;
    }
}
