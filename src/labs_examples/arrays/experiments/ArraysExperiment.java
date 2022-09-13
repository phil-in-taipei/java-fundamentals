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
        System.out.println("Using for each loop to print each item in the array:");
        for (String i : fiveStrings) {
            System.out.println("Item number " + i + ": " + i);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("OK, done!");

        System.out.println("---------------------------------------------------");
        System.out.println("OK, experiments:!");
        System.out.println("This is what happens when you try to loop \n " +
                "through an array of ints with no values:");
        // String array of size five below
        int[] emptyArray = new int[5];

        for (int i=0; i < emptyArray.length; i++) {
            System.out.println(emptyArray[i]);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("The items are all zeros");
        System.out.println("---------------------------------------------------");

        System.out.println("This is what happens when you try to loop \n " +
                "through an array of strings with no values:");
        String[] strings = new String[6];
        //System.out.println(strings.length);
        for (int i=0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("The items are all null");
        System.out.println("---------------------------------------------------");

        //char[] letters = {'k', 'd', 'm', 'i', 'e', 'f', 'g', 'h'};
        //System.out.println(letters[letters.length - 1]);
    }
}
