package labs_examples.input_output.labs;
import java.io.*;
import java.util.Random;


public class DataStreamReadWriteExample {
    public static void main(String[] args) {

        String baseFilePath =
                "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals";
        String outputFilePath =
                baseFilePath
                        + "/src/labs_examples/input_output/labs/buffered_writer_output.txt";

        PrintInfoClass.printExerciseIntro(
                "This will demonstrate data stream I/0 printing three variables to a file"
        );
        PrintInfoClass.printDividerLine();

        Random rand = new Random();

        String abc = "abcdefghijklmnopqrstuvxyz";
        int randomInteger = rand.nextInt();
        double PI = Math.PI;
        char randomCharacter = abc.charAt((int)(abc.length() * Math.random()));

        try(DataOutputStream output = new DataOutputStream(
                new FileOutputStream(outputFilePath)
        )){
            output.writeInt(randomInteger);
            output.writeDouble(PI);
            output.writeChar(randomCharacter);

        } catch(IOException e){
            e.printStackTrace();
        }

        try(DataInputStream input = new DataInputStream(
                new FileInputStream(outputFilePath)
        )){
            randomInteger = input.readInt();
            System.out.println("This is a random integer: " + randomInteger);
            PI = input.readDouble();
            System.out.println("This is pi (a double): " + PI);
            randomCharacter = input.readChar();
            System.out.println("This is a random (char) letter of the alphabet: " + randomCharacter);

        } catch(IOException e){
            e.printStackTrace();
        }

        PrintInfoClass.printExerciseExit("The end!!");
    }
}
