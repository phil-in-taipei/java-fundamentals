package labs_examples.lambdas.labs;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Bi-predicate Built-in");
        PrintInfoClass.printDividerLine();
        System.out.println("Takes in two integers and makes sure both are even");

        PrintInfoClass.printDividerLine();

        BiPredicate<Integer, Integer> bothIntsEven = (n1, n2) -> (n1 % 2 == 0 && n2 % 2 ==0);
        System.out.println(
                "Test 120 and 6: "
                + bothIntsEven.test(120, 6)
        );
        System.out.println(
                "Test 130 and 5: "
                +bothIntsEven.test(130, 5)
        );

        PrintInfoClass.printDividerLine();
        System.out.println(
                "Takes in String and integer and makes sure String is " +
                        "\nlonger than 2 and int is greater than 4"
        );

        PrintInfoClass.printDividerLine();

        BiPredicate<String, Integer> nameAndAgeMinValid = (name, age) -> (name.length() > 2 && age > 4);
        System.out.println(
                "Test Joe and 20: "
                + nameAndAgeMinValid.test("Joe", 20));
        System.out.println(
                "Test T and 100: "
                + nameAndAgeMinValid.test("T", 100));


        PrintInfoClass.printDividerLine();
        System.out.println(
                "Takes in Strings and makes sure they are not the same"
        );

        PrintInfoClass.printDividerLine();

        BiPredicate<String, String> givenSurnameDifferent = (givenName, surName) -> (!givenName.equals(surName));

        System.out.println(
                "Test Jack and Jack: "
                + givenSurnameDifferent.test("Jack", "Jack")
        );
        System.out.println(
                "Test negate Jack and Jack: "
                + givenSurnameDifferent.negate().test("Jack", "Jack")
        );

        PrintInfoClass.printExerciseExit("Bi-predicate Built-in");
    }
}
