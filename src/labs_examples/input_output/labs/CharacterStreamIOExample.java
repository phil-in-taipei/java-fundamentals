package labs_examples.input_output.labs;

import java.io.*;

public class CharacterStreamIOExample {
    public static void main(String[] args){

        PrintInfoClass.printExerciseIntro(
                "This will print a string to a file line by line with line numbers"
        );
        PrintInfoClass.printDividerLine();

        try{
            FileWriter fileWriter = new FileWriter("character_io_example.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i=1; i< 11; i++) {
                bufferedWriter.write("Line number: " + i);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();

        }catch(IOException e1){
            System.out.println("There was an error!");
            e1.printStackTrace();
        }

        try{
            FileReader fileReader = new FileReader("character_io_example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while(line!=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            fileReader.close();

        }catch(IOException e2){
            System.out.println("There was an error!");
            e2.printStackTrace();
        }

        PrintInfoClass.printExerciseExit("The end!".toUpperCase());
        PrintInfoClass.printDividerLine();


    }
}
