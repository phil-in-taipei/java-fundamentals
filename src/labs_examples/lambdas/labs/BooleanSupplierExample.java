package labs_examples.lambdas.labs;
import java.time.LocalDate;
import java.util.function.BooleanSupplier;
public class BooleanSupplierExample {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Boolean Supplier Built-in");
        PrintInfoClass.printDividerLine();
        System.out.println("Determine whether or not today is the first day of the month:");
        PrintInfoClass.printDividerLine();
        BooleanSupplier todayIsFirstDayOfMonth = () -> LocalDate.now().getDayOfMonth() == 1;
        System.out.println(
                "It's the first day of the month: "
                + todayIsFirstDayOfMonth.getAsBoolean()
        );
        PrintInfoClass.printExerciseExit("Boolean Supplier Built-in");
    }


}
