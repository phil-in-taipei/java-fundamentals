package labs_examples.objects_classes_methods.labs.oop.D_my_oop;



import java.util.Objects;
import java.util.Scanner;

public class GeneralSportsBoardController {

    static boolean continueLoop = true;
    public static void main(String[] args) {


        String BLACK_TEXT = "\u001B[30m";
        String WHITE_BACKGROUND = "\u001B[47m";
        String STANDARD_FORMAT = "\u001B[0m";

        //boolean continueLoop = true;

        printDividingLine();

        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        " -- Welcome to Sport Board System -- "
                        + STANDARD_FORMAT
        );

        printDividingLine();

        while(continueLoop) {
            System.out.println(
                    "Do you want to utilize the board purchasing system?"
                            + "\n'Y') Yes"
                            + "\n'N') No thanks, I'm done"
            );
            Scanner eventLoopScanner = new Scanner(System.in);
            String letsScheduleSomething = eventLoopScanner.next();


            if (letsScheduleSomething.equalsIgnoreCase("y")) {
                continueLoop = true;
                GeneralSportsBoardController controller = new GeneralSportsBoardController();

                printDividingLine();
                System.out.println(
                        "Please input the board option:"
                                + "\n1) Stand Up Paddle Board (SUP)"
                                + "\n2) Skateboard"
                );

                String loopOptionInput = controller.getLoopOption();


                if (Objects.equals(loopOptionInput, "1")) {
                    //SocialEvent userInputSocialEvent = new SocialEvent();
                    printDividingLine();
                    System.out.println(
                            "OK, let's announce the release of an SUP Paddle Board"

                    );
                    printDividingLine();

                    System.out.println(
                            "Please input the SUP product name:"
                    );
                    String productNameInput = controller.getProductName();
                    System.out.println(productNameInput);
                    printDividingLine();
                    StandUpPaddleBoard supProduct = new StandUpPaddleBoard(
                            80, 8, 2,
                            "pavement", productNameInput,
                            2022, "Ocean",
                            true, 5
                    );
                    printDividingLine();
                    System.out.println(
                            BLACK_TEXT + WHITE_BACKGROUND +
                                    "You have created the following SUP product object:"
                                    + STANDARD_FORMAT
                                    + "\n"
                                    + supProduct.toString()
                    );
                    printDividingLine();
                } else {
                    printDividingLine();
                    System.out.println(
                            "OK, let's announce the release of an skateboard"

                    );
                    printDividingLine();

                    System.out.println(
                            "Please input the skateboard product name:"
                    );
                    String productNameInput = controller.getProductName();
                    Skateboard skateboardObject = new Skateboard(
                            80, 8, 2,
                            "pavement", "Toy Machine",
                            productNameInput, 2021,
                            "vert ramp", 52
                    );
                    System.out.println(
                            BLACK_TEXT + WHITE_BACKGROUND +
                                    "You have created the following skatboard product object:"
                                    + STANDARD_FORMAT
                                    + "\n"
                                    + skateboardObject.toString()
                    );
                    printDividingLine();
                }

            } else {
                continueLoop = false;
                System.out.println(
                        BLACK_TEXT + WHITE_BACKGROUND +
                                " -- Exiting Sport Board System -- "
                                + STANDARD_FORMAT
                );
                break;
            }
        }

    }


    public String getProductName() {
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        printDividingLine();
        return productName;
    }

    public String getLoopOption() {
        Scanner eventOptionScanner = new Scanner(System.in);
        String loopOption = eventOptionScanner.nextLine();
        printDividingLine();
        System.out.println("You entered this board type option: " + loopOption);
        return loopOption;
    }

    public static void printDividingLine() {
        System.out.println(
                "-----------------------------------------------------------------------------------"
        );
    }
}
