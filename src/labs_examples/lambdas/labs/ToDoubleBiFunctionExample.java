package labs_examples.lambdas.labs;
import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("ToDoubleBi Built-in");
        PrintInfoClass.printDividerLine();
        System.out.println("Takes in an integer and a string and adds them to return as a double");
        ToDoubleBiFunction<Integer, String>
                integerPlusString = (a, b) -> a + Integer.parseInt(b);
        PrintInfoClass.printDividerLine();
        System.out.println("This is integer 3000 plus string 555:");
        System.out.println(integerPlusString.applyAsDouble(3000, "555"));
        PrintInfoClass.printExerciseExit("ToDoubleBi Built-in");
    }
}
