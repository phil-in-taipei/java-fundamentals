package labs_examples.exception_handling.experiments;

public class ExceptionExperiment {

    public static void main(String[] args) {

        int[] divideNums = { 1, 3, 5, 0 };


        for (int i = 0; i < divideNums.length; i++) {
            System.out.println(i);
            System.out.println("The result is:");
            try {
                float result = divideNums[i] / divideNums[i] * 2;
                System.out.println(result);
            } catch (ArithmeticException exc) {
                System.out.println("Arithmetic Exception: " + exc.getMessage());
                exc.printStackTrace();
            } catch (Exception exc) {
                System.out.println("Error: " + exc.getMessage());
                exc.printStackTrace();
            }
        }
        System.out.println("Program complete");
    }
}
