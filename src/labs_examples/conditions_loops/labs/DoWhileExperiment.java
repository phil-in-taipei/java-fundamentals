package labs_examples.conditions_loops.labs;

public class DoWhileExperiment {
    public static void main(String[] args) {
        int counter = 0;

        // please use a while loop to print out every 3rd number between 0 and 100 below
        System.out.println("");
        System.out.println("This is every 3rd number between 0 and 100");
        while(counter<100) {
            if (counter % 3 == 0) {
                System.out.println("Counter is : " + counter);
            }
            counter++;
        }

        System.out.println("----------------------------------------------------");
        // please use a do-while loop to print out every 5th number below
        // this will also print 0
        System.out.println("This is every 5th number between 0 and 100; including 0");
        int anotherCounter = 0;
        do {
            if (anotherCounter % 5 == 0) {
                System.out.println("The other counter is: " + anotherCounter);  }
            anotherCounter++;
        }while(anotherCounter<100);

        System.out.println("----------------------------------------------------");

        int count = 0;

        int val = 0;

        while(count < 10){
            //System.out.println("Count is : " + count);
            val = val + count;
            //System.out.println("Val is : " + val);
            count++;
        }
        System.out.println("Val is : " + val);


        System.out.println("----------------------------------------------------");

        int count2 = 0;

        int val2 = 0;
        do {
            val2 += count2;
            count2++;
        }while(count2<10);
        System.out.println("Val2 is : " + val2);
    }
}
