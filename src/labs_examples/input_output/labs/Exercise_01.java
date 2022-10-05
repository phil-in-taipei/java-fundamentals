package labs_examples.input_output.labs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;


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
        BufferedInputStream bufferedInputStream = null;

        try {
            inputStream = new FileInputStream("data.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                // print out bytes read to console
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            System.out.println("An error occurred: " + exc.getMessage());
            exc.printStackTrace();
        } finally {
            // we be using the Try-With-Resources shortly to avoid the need for this
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}