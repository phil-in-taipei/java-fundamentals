package labs_examples.conditions_loops.labs;

public class ForLoopsExperiments {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("This is every number between 0 and 100");
        for (int i=0; i<101; i++){
            System.out.println(i);
        }
        System.out.println("------------------------------------------------");
        System.out.println("");
        // please use another for loop below to print out every odd number between 100 and 0 in descending order

        System.out.println("This is every even number between 0 and 100");
        for (int i=0; i<101; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------------------------------------------------");
        System.out.println("");

        // please demonstrate "nesting" two for loops below
        System.out.println("This is a nested loop");
        System.out.println("------------------------------------------------");
        for (int outerInt=0; outerInt<10; outerInt++){
            System.out.println("This is the outer int: ".toUpperCase() + outerInt);
            System.out.println("------------------------------------------------");
            for (int innerInt=0; innerInt<10; innerInt++){
                System.out.println("This is the inner int: " + innerInt);
            }
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("This is the exercise:");
        // declare an int variable named "val" and set it to zero
        int val = 0;
        // write a for loop (with a counting variable named "i") that will iterate from zero to 100 (inclusive),
        // incrementing by 1 on each loop
        for (int i=0; i<101; i++){
            val += i;
        }
        // inside the for loop, add the value of "i" to the current value of "val"
        System.out.println(val);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("This is other exercise:");
        //int i;
        int j = 0;
        for(int i = 100; i >= 0; i -= 1){
            j = j + i;
        }
        System.out.println(j);
    }
}
