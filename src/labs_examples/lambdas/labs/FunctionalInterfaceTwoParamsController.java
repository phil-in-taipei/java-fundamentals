package labs_examples.lambdas.labs;

public class FunctionalInterfaceTwoParamsController {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Functional Interface Two Params");
        PrintInfoClass.printDividerLine();

        System.out.println("Lambda object with two int params returns an int:");
        PrintInfoClass.printDividerLine();
        FunctionalInterfaceTwoParams multiplyLambdaObj = (int a, int b) -> a * b;
        System.out.println(
                " 6 times 2 is: "
                + multiplyLambdaObj.anonymousTwoParamsReturnInt(6, 2)
        );

        PrintInfoClass.printDividerLine();

        System.out.println("Abstract function object with two int params returns an int:");
        PrintInfoClass.printDividerLine();

        FunctionalInterfaceTwoParams anonymousMultiplyObj = new FunctionalInterfaceTwoParams() {
            @Override
            public int anonymousTwoParamsReturnInt(int a, int b) {
                return a * b;
            }

        };


        System.out.println(
                "6 times 2 is: "
                + anonymousMultiplyObj.anonymousTwoParamsReturnInt(6, 2)
        );

        PrintInfoClass.printExerciseExit("Functional Interface Two Params");
    }
}
