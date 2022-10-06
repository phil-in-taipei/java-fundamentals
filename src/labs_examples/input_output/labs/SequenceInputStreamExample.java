package labs_examples.input_output.labs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        String inputPath2 = "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals/src/labs_examples/input_output/labs/byte_data2";
        String inputPath1 = "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals/src/labs_examples/input_output/labs/byte_data";

        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream sequence = null;
        try {
            file1 = new FileInputStream(inputPath1);
            file2 = new FileInputStream(inputPath2);
            sequence = new SequenceInputStream(file1, file2);
            int i;
            try {
                while ((i = sequence.read()) != -1) {
                    System.out.print((char) i);
                }
                } catch (IOException exp) {
                    System.out.println(exp.getMessage());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                file1.close();
                file2.close();
                sequence.close();
            } catch (IOException ex) {
                //ex.printStackTrace();
                System.out.println("An I/O error occurred: " + ex.getMessage());
            } catch (Exception ex) {
                //ex.printStackTrace();
                System.out.println("An error occurred: " + ex.getMessage());
            }
        }
    }
}
