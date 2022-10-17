package labs_examples.lambdas.experiments;


public class LambdaTrials {

    private int operate(int a, int b, FunctionalItnterFaceForLamdaAsMethod fobj)  {
        return fobj.operation(a, b);
    }
    public static void main(String args[])  {
        // lambda expression to implement above functional interface.
        FunctionalInterfaceForLambda lambda = (int x) -> System.out.println(x * 2);
        // This invokes the lambda expression and prints 10
        lambda.abstractFunction(5);
        // redefine the lambda
        lambda = (int x) -> System.out.println(x * x);
        // This invokes the lambda expression and prints 25

        lambda.abstractFunction(5);

        FunctionalItnterFaceForLamdaAsMethod add = (int x, int y) -> x + y;
        FunctionalItnterFaceForLamdaAsMethod multiply = (int x, int y) -> x * y;
        LambdaTrials obj = new LambdaTrials();

        // Add two numbers using lambda expression
        System.out.println("Addition is " + obj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is " + obj.operate(6, 3, multiply));
    }

}
