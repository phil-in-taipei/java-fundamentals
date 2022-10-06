package labs_examples.input_output.labs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.nio.charset.StandardCharsets;


/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws IOException {
        // char_data.txt
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        String filePath = "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals/src/labs_examples/input_output/labs/data.txt"; // byte_data
        String outputFilePath = "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals/src/labs_examples/input_output/labs/output_data.txt";

        try {
            inputStream = new FileInputStream(filePath);
            bufferedInputStream = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream(outputFilePath);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
                String outputStr = new String(buffer, 0, bytesRead);
                outputStream.write(outputStr.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException exc) {
            System.out.println("An error occurred: " + exc.getMessage());
            //exc.printStackTrace(); // too verbose!!
        } finally {
            try {
                inputStream.close();
                bufferedInputStream.close();
                outputStream.close();
            } catch (IOException ex) {
                //ex.printStackTrace();
                System.out.println("An error occurred: " + ex.getMessage());
            }
        }
    }

}