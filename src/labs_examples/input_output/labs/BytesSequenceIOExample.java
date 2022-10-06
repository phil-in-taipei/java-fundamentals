package labs_examples.input_output.labs;

import java.io.*;

public class BytesSequenceIOExample {
    public static void main(String[] args) {
        String baseFilePath =
                "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals";

        String firstInputFilePath = baseFilePath + "/src/labs_examples/input_output/labs/byte_data";
        String secondInputFilePath = baseFilePath + "/src/labs_examples/input_output/labs/byte_data2";

        String thirdOutputFilePath = baseFilePath + "/src/labs_examples/input_output/labs/byte_data3";

        PrintInfoClass.printExerciseIntro(
                "This will read byte data from two files and write sequentially to a third file"
        );
        PrintInfoClass.printDividerLine();

        FileInputStream firstByteDataFile = null;
        FileInputStream secondByteDataFile = null;
        FileOutputStream thirdByteDataFile = null;

        SequenceInputStream sequenceInputStream = null;
        try {
            firstByteDataFile = new FileInputStream(firstInputFilePath);
            secondByteDataFile = new FileInputStream(secondInputFilePath);
            sequenceInputStream = new SequenceInputStream(
                    firstByteDataFile, secondByteDataFile
            );
            thirdByteDataFile = new FileOutputStream(thirdOutputFilePath);
            int i;
            try {
                while ((i = sequenceInputStream.read()) != -1) {
                    System.out.print((char) i);
                    thirdByteDataFile.write(i);
                }
                System.out.print("\n");
            } catch (IOException exp) {
                System.out.println(exp.getMessage());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                firstByteDataFile.close();
                secondByteDataFile.close();
                sequenceInputStream.close();
                thirdByteDataFile.close();
            } catch (IOException ex) {
                //ex.printStackTrace();
                System.out.println("An I/O error occurred: " + ex.getMessage());
            } catch (Exception ex) {
                //ex.printStackTrace();
                System.out.println("An error occurred: " + ex.getMessage());
            }
        }

        PrintInfoClass.printExerciseExit("That is the end!");
    }
}
