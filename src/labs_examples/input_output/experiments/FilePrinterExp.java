package labs_examples.input_output.experiments;
import java.io.FileReader;
import java.io.IOException;

public class FilePrinterExp {


        public static void printFile(String filePath) throws IOException{

            // initialize FileReader "fr" to null
            FileReader fr = null;

            try {
            /*  2. Fully initialize Reader "fr" with "filePath" variable in Try
                statement in case files don't exist
                or can't be accessed. Remember to pass the
                filePath as a parameter */

                //BufferedReader br = new BufferedReader(filePath);

                fr = new FileReader(filePath);
                int c;

                // 3. While fr has more characters to read
                while ((c = fr.read()) != -1) {
                    // Print the character to the console
                    // don't forget to cast the int to a char
                    char b = (char) c;
                    System.out.print(b);
                }
            } catch (IOException exc) {
                System.out.println("An error occurred: " + exc.getMessage());
            } finally {

            }

            if (fr != null) {
                // 4. Close connections
                fr.close();
            }
        }
}