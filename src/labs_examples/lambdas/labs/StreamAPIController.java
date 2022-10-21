package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIController {
        public static void main(String[] args) throws IOException {
        PrintInfoClass.printExerciseIntro("Stream API");
        PrintInfoClass.printDividerLine();

        //List<Integer> nums = Arrays.asList(100, 98, 56);
        //Integer sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Range function to print out the numbers 1 through 15:");
        IntStream.range(1, 15).forEach(System.out::println);
        PrintInfoClass.printDividerLine();

        System.out.println("Sum function to determine the range 1 through 15:");
        int sum = IntStream.range(1, 5).sum();
        System.out.println(sum);
        PrintInfoClass.printDividerLine();

        System.out.println("map() function to multiply each int (1 to 5) by 2, then get sum:");
        Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .map(x -> x * 2)
                .average()
                .ifPresent(System.out::println);
        PrintInfoClass.printDividerLine();

        System.out.println(
                "Filter all Integers that are less than 10 (1 through 37), then use"
                + "\nthe average function to average the remaining numbers");

        Integer result;
        result = (int) IntStream.range(1, 37)
                .filter(x -> x < 10)
                .average().getAsDouble();

        System.out.println(result);
        PrintInfoClass.printDividerLine();

        System.out.println(
                "Reduce() function to determine the sum of a list of Integers (7, 1, 4, 24, 3)"
        );


        Integer total = Stream.of(7, 1, 4, 24, 3)
                .reduce(0, (Integer a, Integer b) -> (a + b));

        System.out.println(total);
        PrintInfoClass.printDividerLine();

        System.out.println(
                "Stream content from a data file, print each line:"
        );

        String textFile = "src/labs_examples/lambdas/labs/text_file.txt";

        Stream<String> textFileContent = Files.lines(Paths.get(textFile));
        textFileContent
                .sorted()
                .forEach(System.out::println);
        textFileContent.close();
        PrintInfoClass.printDividerLine();

        System.out.println(
                "Stream the stream_text_lab.csv file. Split the lines into String arrays,"
                + "\nthen print out the element at the 1 index"
        );

        String csvFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        Stream<String> rowsFromCSVFile = Files.lines(Paths.get(csvFile));
        rowsFromCSVFile
                .map(x -> x.split(","))
                //.filter(x -> x.length == 3)
                //.filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println("This is at index 1: " + x[1]));

        rowsFromCSVFile.close();
        PrintInfoClass.printDividerLine();
        System.out.println(
                "Stream the stream_text_lab.csv file. Split the lines into String arrays,"
                + "\nprint out the sum of all elements at index 2:"
        );

        Stream<String> rowsFromCSVFile2 = Files.lines(Paths.get(csvFile));
        double summation = rowsFromCSVFile2
                    .map((s) -> s.split(","))
                    .mapToDouble((x) -> Double.parseDouble(x[2]))
                    .sum();
        System.out.println(summation);
        rowsFromCSVFile2.close();

        PrintInfoClass.printExerciseExit("Stream API");



    }

    static int sumOfString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += str.charAt(i) - '0';
            }
        }
        return sum;
    }
}
