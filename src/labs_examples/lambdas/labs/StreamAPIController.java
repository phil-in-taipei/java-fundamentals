package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIController {
        public static void main(String[] args) throws IOException {
        PrintInfoClass.printExerciseIntro("Stream API");
        PrintInfoClass.printDividerLine();

        System.out.println("1.) Range function to print out the numbers 1 through 15:");
        PrintInfoClass.printDividerLine();;
        IntStream.range(1, 15).forEach(System.out::println);
        PrintInfoClass.printDividerLine();

        System.out.println("2.) Sum function to determine the sum of 1 through 5:");
        PrintInfoClass.printDividerLine();
        int sumOfRangeOneToFive = IntStream.range(1, 5).sum();
        System.out.println(sumOfRangeOneToFive);
        PrintInfoClass.printDividerLine();

        System.out.println(
                "3.) Map() function to multiply each int (1 to 5) by 2, then get sum:"
        );
        PrintInfoClass.printDividerLine();
        Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .map(x -> x * 2)
                .average()
                .ifPresent(System.out::println);
        PrintInfoClass.printDividerLine();

        System.out.println(
                "4.) Filter all Integers that are less than 10 (1 through 37), then use"
                + "\nthe average function to average the remaining numbers");
        PrintInfoClass.printDividerLine();

        Integer result;
        result = (int) IntStream.range(1, 37)
                .filter(x -> x < 10)
                .average().getAsDouble();

        System.out.println(result);
        PrintInfoClass.printDividerLine();

        System.out.println(
                "5.) Reduce() function to determine the sum of a list of Integers (7, 1, 4, 24, 3)"
        );
        PrintInfoClass.printDividerLine();


        Integer total = Stream.of(7, 1, 4, 24, 3)
                .reduce(0, (Integer a, Integer b) -> (a + b));

        System.out.println(total);
        PrintInfoClass.printDividerLine();

        System.out.println(
                "6.) Stream content from a text file, and print each line:"
        );
        PrintInfoClass.printDividerLine();

        String textFile = "src/labs_examples/lambdas/labs/text_file.txt";

        Stream<String> textFileContent = Files.lines(Paths.get(textFile));
        textFileContent
                .sorted() // to alphabetize the lines
                .forEach(System.out::println);
        textFileContent.close();

        PrintInfoClass.printDividerLine();

        System.out.println(
                "7.) Stream the stream_text_lab.csv file. Split the lines into String arrays,"
                + "\nthen print out the element at the 1 index"
        );
        PrintInfoClass.printDividerLine();

        String csvFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        Stream<String> rowsFromCSVFile = Files.lines(Paths.get(csvFile));
        rowsFromCSVFile
                .map(x -> x.split(",")) // makes string into array
                .forEach(x -> System.out.println("This is at index 1: " + x[1]));

        rowsFromCSVFile.close();
        PrintInfoClass.printDividerLine();
        System.out.println(
                "8.) Stream the stream_text_lab.csv file. Split the lines into String arrays,"
                + "\nprint out the sum of all elements at index 2:"
        );
        PrintInfoClass.printDividerLine();

        Stream<String> rowsFromCSVFile2 = Files.lines(Paths.get(csvFile));
        double summation = rowsFromCSVFile2
                    .map((s) -> s.split(",")) // makes string into array
                    .mapToDouble((x) -> Double.parseDouble(x[2]))
                    .sum();
        System.out.println(summation);
        rowsFromCSVFile2.close();
        PrintInfoClass.printDividerLine();

        System.out.println(
                "9.) Using the anyMatch() function to check if any of integers "
                +"\n(10, 2, 20, 1, 100, 10000) are greater than 5:"
        );
        PrintInfoClass.printDividerLine();

        List<Integer> listOfIntsForAnyOfAllOf = Arrays.asList(10, 2, 20, 1, 100, 10000);


       boolean someIntegersAreGreaterThanFive = listOfIntsForAnyOfAllOf
               .stream()
               .anyMatch(s -> s > 5);

       System.out.println(someIntegersAreGreaterThanFive);


        PrintInfoClass.printDividerLine();

        System.out.println(
                "10.) Using the allMatch() function to check if integers "
                +"\n(10, 2, 20, 1, 100, 10000) are all greater than 5:"
        );
        PrintInfoClass.printDividerLine();

        boolean integersAreAllGreaterThanFive = listOfIntsForAnyOfAllOf
                .stream()
                .allMatch(s -> s > 5);
        System.out.println(integersAreAllGreaterThanFive);

        PrintInfoClass.printDividerLine();
        System.out.println(
                "11.) Using collect() terminal operation to store values into a List:"
        );
        PrintInfoClass.printDividerLine();
        List<Double> listOfDoublesFromCollection = Stream
                .of(20.39230, 30.20320, 233232.02)
                // can directly just put in values with of -- like rxjs
                .collect(Collectors.toList());
        UtilitiesClass.printArray(listOfDoublesFromCollection.toArray());

        PrintInfoClass.printExerciseExit("Stream API");

    }

    static int sumOfString(String str) { // no need for this
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += str.charAt(i) - '0';
            }
        }
        return sum;
    }
}
