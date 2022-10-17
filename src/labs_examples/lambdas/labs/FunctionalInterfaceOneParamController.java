package labs_examples.lambdas.labs;

public class FunctionalInterfaceOneParamController {
    public static void main(String[] args) {
        PrintInfoClass.printExerciseIntro("Functional Interface One Param");
        PrintInfoClass.printDividerLine();

        FunctionalInterfaceOneParam lambdaObj = (String string) -> System.out.println(string.toUpperCase());
        lambdaObj.abstractFunction("I am from lamda object");

        PrintInfoClass.printDividerLine();

        FunctionalInterfaceOneParam anonymousObj = new FunctionalInterfaceOneParam() {
            @Override
            public void abstractFunction(String string) {
                System.out.println(string.toUpperCase());
            }

        };

        anonymousObj.abstractFunction("I am from abstract function object");

        PrintInfoClass.printExerciseExit("Functional Interface One Param");
    }

}
