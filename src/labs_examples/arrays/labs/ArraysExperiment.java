package labs_examples.arrays.labs;

public class ArraysExperiment {
    public static void main(String[] args) {
        // please demonstrate how to declare and initialize a
        // String array of size five below
        String[] fiveStrings = new String[5];

        String chainOfAs = "";
        System.out.println("--------------------------------------------------");
        // once initialized, please populate each index of the array
        System.out.println("Populating each index of an array of strings:");
        for (int i = 0; i < fiveStrings.length; i++) {
            chainOfAs += "A";
            fiveStrings[i] = chainOfAs;
        }

        // once populated, please print out each element in the array
        // using a For Loop
        System.out.println("-------------------------------------------------");
        System.out.println("Using a for loop to print each item in the array:");
        for (int i = 0; i < fiveStrings.length; i++) {
            System.out.println("Item number " + i + ": " + fiveStrings[i]);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Using another loop to print each item in the array:");
        for (String i : fiveStrings) {
            System.out.println("Item number " + i + ": " + i);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("OK, done!");

        //String[] strings = new String[6];
        //System.out.println(strings.length);

        //char[] letters = {'k', 'd', 'm', 'i', 'e', 'f', 'g', 'h'};
        //System.out.println(letters[letters.length - 1]);
    }
}
