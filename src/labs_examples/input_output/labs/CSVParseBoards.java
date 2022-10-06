package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

public class CSVParseBoards {
    public static void main(String[] args) {
        ArrayList<SportingBoard> boards = new ArrayList();

        String baseFilePath = "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals";
        String csvFilePath = baseFilePath + "/src/labs_examples/input_output/labs/sporting_boards.csv";

        PrintInfoClass.printExerciseIntro("This will read data from a csv file, and create 'Sporting Board Objects'");
        PrintInfoClass.printDividerLine();

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(csvFilePath))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                boards.add(mapValuesToSportingBoardObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(SportingBoard board : boards){
            System.out.println(board.toString());
        }

        PrintInfoClass.printExerciseExit(
                "Those are the objects created from csv file data!"
        );

    }

    private static SportingBoard mapValuesToSportingBoardObject(String[] values) {

        SportingBoard board = new SportingBoard();

        board.setBrandName(values[0]);
        board.setModelName(values[1]);
        board.setYearReleased(Integer.parseInt(values[2]));

        return board;
    }
}
