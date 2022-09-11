package labs_examples.conditions_loops;

public class BreakContinueExperiments {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("And example of break with labels:");
        for (int i = 0; i < 10; i++) {
            one: {
                two:{
                    if(i==4) {
                        break one; // breaks to label one, prints message
                    }
                    System.out.println("Print in label two: " + i);  // if i !=0, this will print
                }
                System.out.println("Print in label one: " + i);
            }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("And example of continue:");
        // print even number between 0 and 100
        // includes 0
        for(int i = 0; i<=20; i++) {
            if((i%2) != 0) { // odd number
                continue; // iterate
            }
            System.out.println(i);
        }
    }
}
