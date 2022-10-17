package labs_examples.lambdas.labs;

//import labs_examples.lambdas.experiments.AnonymousInner;

import labs_examples.lambdas.experiments.FunctionalInterfaceForLambda;

public class FunctionalInterfaceNoParamsController {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Functional Interface No Params");
        FunctionalInterfaceNoParams anonymousObj = new FunctionalInterfaceNoParams() {
            @Override
            public void abstractFunction() {
                System.out.println("Hello from an abstract method");
            }

        };

        PrintInfoClass.printDividerLine();

        anonymousObj.abstractFunction();

        FunctionalInterfaceNoParams lambdaObj = () -> System.out.println("Hello from Lamda");
        lambdaObj.abstractFunction();

        PrintInfoClass.printExerciseExit("Functional Interface No Params");
    }
}
