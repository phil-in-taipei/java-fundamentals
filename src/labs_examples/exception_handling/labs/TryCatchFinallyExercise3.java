package labs_examples.exception_handling.labs;

public class TryCatchFinallyExercise3 {

    static String[] nameArray = { "Matty", "Dave", "Laura", "Leslie", "Jennifer"};
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        System.out.println("Try/catch/finally example:");

        System.out.println("--------------------------------------------------");
        System.out.println("**************************************************");

        for (int i = 0; i < nameArray.length; i++) {
            try {
                System.out.println("--------------------------------------------------");
                System.out.println("Name: " + nameArray[i]);
                System.out.println("--------------------------------------------------");
                int remainder = i % 2;
                System.out.println("Length of name divided remainder of index / 2: ");
                System.out.println(nameArray[i].length() / remainder);
                System.out.println("--------------------------------------------------");
            } catch(ArithmeticException exception) {
                System.out.println(exception.toString());
            } finally {
                System.out.println("This loop iteration has finished!");
            }
        }
    }
}
