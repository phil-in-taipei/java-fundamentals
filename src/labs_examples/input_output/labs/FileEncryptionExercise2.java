package labs_examples.input_output.labs;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptionExercise2 {
    public static void main(String[] args) {

        String baseFilePath = "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals";

        String originalFilePath = baseFilePath + "/src/labs_examples/input_output/labs/data.txt";
        String outputFilePath = baseFilePath + "/src/labs_examples/input_output/labs/encrypted_output.txt";
        String outputFilePath2 = baseFilePath + "/src/labs_examples/input_output/labs/decrypted_output.txt";
        readWriteAndEncryptChars(originalFilePath, outputFilePath);
        readDecryptAndPrintChars(outputFilePath, outputFilePath2);

    }

    public static void readWriteAndEncryptChars (String originalFilePath, String outputFilePath) {
        try (FileReader reader = new FileReader(originalFilePath);
             FileWriter writer = new FileWriter(outputFilePath)) {
            int i;
            char character;
            while ((i = reader.read()) != -1) {
                character = (char) i;
                if (character == 'a') {
                    character = '-';
                }
                if (character == 'e') {
                    character = '~';
                }
                writer.write((int) character);
            }
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }

    public static void readDecryptAndPrintChars (String encryptedFilePath, String outputFilePath2) {
        try (FileReader reader = new FileReader(encryptedFilePath);
             FileWriter writer = new FileWriter(outputFilePath2)) {
            int i;
            char character;
            while ((i = reader.read()) != -1) {
                character = (char) i;
                if (character == '-') {
                    character = 'a';
                }
                if (character == '~') {
                    character = 'e';
                }
                System.out.print(character);
                writer.write((int) character);
            }
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }


}
