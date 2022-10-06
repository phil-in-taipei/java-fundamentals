package labs_examples.input_output.labs;
import java.io.*;

public class BufferedWriterExample {

    public static void main(String[] args) {

        String baseFilePath = "/home/thinkpad/Documents/coding_nomads_code/java_learning/my_code_practice/labs/online-java-fundamentals";

        String outputFilePath = baseFilePath + "/src/labs_examples/input_output/labs/buffered_writer_output.txt";

        String str = "This is a String";

        for (int i =0 ; i < 10; i++) {
            str = str + "!";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))){
                bw.write(str);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        try(BufferedReader br = new BufferedReader(new FileReader(outputFilePath))){
            String y;
            while((y = br.readLine()) != null){
                System.out.println(y);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
