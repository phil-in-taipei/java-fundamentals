package labs_examples.lambdas.experiments;

public class RunnableLambdaClass {
    public static void main(String[] args) {

        // Step 1) declare a Lambda expression using the Runnable interface

        // Step 2) declare a new Thread object and pass in the Runnable Lambda

        // Step 3) start the thread
        Runnable runnableLamdba = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Looping through Runnable, number: " + i);
            }

        };
        Thread threadUsingRunnableLambda = new Thread(runnableLamdba);
        threadUsingRunnableLambda.start();

    }

}
