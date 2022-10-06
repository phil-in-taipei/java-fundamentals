package labs_examples.input_output.labs;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptionExercise2 {
    public static void main(String[] args) {

        String baseFilePath =
                "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals";

        String originalFilePath = baseFilePath +
                "/src/labs_examples/input_output/labs/data.txt";
        String encryptedOutputFilePath = baseFilePath +
                "/src/labs_examples/input_output/labs/encrypted_output.txt";
        String decryptedOutputFilePath = baseFilePath +
                "/src/labs_examples/input_output/labs/decrypted_output.txt";

        PrintInfoClass.printExerciseIntro(
                "This will read text from a file, and then save it with "
                + "2 letters replaced (mock encryption) into another file. It will "
                + "then read the file from the 'encrypted file' with the letters switched back"
        );
        PrintInfoClass.printDividerLine();

        readWriteAndEncryptChars(originalFilePath, encryptedOutputFilePath);
        readDecryptAndPrintChars(encryptedOutputFilePath, decryptedOutputFilePath);

    }

    public static void readWriteAndEncryptChars (
            String originalFilePath, String encryptedOutputFilePath
    ) {
        try (FileReader fileReader = new FileReader(originalFilePath);
             FileWriter fileWriter = new FileWriter(encryptedOutputFilePath)) {
            int i;
            char character;
            while ((i = fileReader.read()) != -1) {
                character = (char) i;
                if (character == 'a') {
                    character = '-';
                }
                if (character == 'e') {
                    character = '~';
                }
                fileWriter.write(character);
            }
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }

    public static void readDecryptAndPrintChars (
            String encryptedFilePath,
            String decryptedOutputFilePath) {
        try (FileReader fileReader = new FileReader(encryptedFilePath);
             FileWriter fileWriter = new FileWriter(decryptedOutputFilePath)) {
            int i;
            char character;
            while ((i = fileReader.read()) != -1) {
                character = (char) i;
                if (character == '-') {
                    character = 'a';
                }
                if (character == '~') {
                    character = 'e';
                }
                System.out.print(character);
                fileWriter.write(character);
            }
            System.out.print("\n");
        } catch (IOException exc){
            exc.printStackTrace();
        }

        PrintInfoClass.printExerciseExit("The end!!");
    }


}
