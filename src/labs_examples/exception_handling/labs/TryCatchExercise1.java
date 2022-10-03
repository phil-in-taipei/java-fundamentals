package labs_examples.exception_handling.labs;

public class TryCatchExercise1 {

    static int zero = 0;

    public static void main(String[] args) {

        try {
            System.out.println("This is not allowed in Java: " + 1 /zero );
        } catch(Exception exc) {
            System.out.println(exc.toString());
        }

    }
}
