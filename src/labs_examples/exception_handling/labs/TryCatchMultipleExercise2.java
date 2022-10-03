package labs_examples.exception_handling.labs;

public class TryCatchMultipleExercise2 {

    static String[] nameStrings = { "Matty", "Dave", "Laura", "Leslie", "Jennifer"};
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("Demonstrating try with 2 catch blocks:");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < nameStrings.length; i++) {
            try {
                System.out.println("-----------------------------------------------");
                System.out.println("Trying to print: " + nameStrings[i]);
                System.out.println(nameStrings[i].charAt(5));
                int remainder = i % 2;
                System.out.println(remainder);
                System.out.println(nameStrings.length / remainder);
            } catch(IndexOutOfBoundsException exception) {
                System.out.println("--------------------------------------------------");
                System.out.println(exception.toString());
                System.out.println("Error because index 5 doesn't exist");
            } catch (ArithmeticException exp){
                System.out.println("--------------------------------------------------");
                System.out.println(exp.toString());
                System.out.println("Error because remainder is zero and cannot divide");
            }

        }
        System.out.println("-----------------------------------------------");
    }
}
