package labs_examples.input_output.labs;
import java.io.*;

public class BufferedWriterExample {

    public static void main(String[] args) {

        String baseFilePath =
                "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals";

        String outputFilePath = baseFilePath
                + "/src/labs_examples/input_output/labs/buffered_writer_output.txt";

        PrintInfoClass.printExerciseIntro(
                "This will print a string to a file with exclamation marks added on"
        );
        PrintInfoClass.printDividerLine();

        String inputStr = "This is so exciting".toUpperCase();

        for (int i =0 ; i < 10; i++) {
            inputStr = inputStr + "!";
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))){
                bufferedWriter.write(inputStr);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(outputFilePath))){
            String outputStr;
            while((outputStr = bufferedReader.readLine()) != null){
                System.out.println(outputStr);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        PrintInfoClass.printExerciseExit("The end!");
        PrintInfoClass.printDividerLine();
    }

}
