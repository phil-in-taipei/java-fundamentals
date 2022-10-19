package labs_examples.lambdas.labs;

import java.util.function.IntPredicate;

public class IntPredicateExample {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("IntPredicate Built-in");
        PrintInfoClass.printDividerLine();
        System.out.println("Creating 3 conditions to check if a year (int) is in this century or in the 1970s");
        PrintInfoClass.printDividerLine();

        IntPredicate isThisCentury = (x) -> {
            if (x >= 2000 & x < 2100)
                return true;
            return false;
        };

        IntPredicate is1970s = (x) -> {
            if (x >= 1970 & x < 1980)
                return true;
            return false;
        };

        IntPredicate isThisCenturyOr1970s = isThisCentury.or(is1970s);

        System.out.println(
                "Testing 1990: "
                + isThisCenturyOr1970s.test(1990)
        );

        System.out.println(
                "Testing 2020: "
                + isThisCenturyOr1970s.test(2020)
        );

        System.out.println(
                "Testing 1975: "
                +isThisCenturyOr1970s.test(1975)
        );

        System.out.println(
                "Testing 2150: "
                + isThisCenturyOr1970s.test(2150)
        );

        PrintInfoClass.printExerciseExit("IntPredicate Built-in");

    }
}
