package labs_examples.objects_classes_methods.labs.oop.D_my_oop;



import java.util.Objects;
import java.util.Scanner;

public class GeneralSportsBoardController {
    public static void main(String[] args) {

        String BLACK_TEXT = "\u001B[30m";
        String WHITE_BACKGROUND = "\u001B[47m";
        String STANDARD_FORMAT = "\u001B[0m";

        boolean continueLoop = true;

        System.out.println(
                "-----------------------------------------------------------------------------------"
        );

        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        " -- Welcome to Sport Board System -- "
                        + STANDARD_FORMAT
        );

        System.out.println("-----------------------------------------------------------------------------------");

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

                System.out.println(
                        "Please input the board option:"
                                + "\n1) Stand Up Paddle Board (SUP)"
                                + "\n2) Skateboard"
                );

                String loopOptionInput = controller.getLoopOption();


                if (Objects.equals(loopOptionInput, "1")) {
                    //SocialEvent userInputSocialEvent = new SocialEvent();
                    System.out.println(
                            "-----------------------------------------------------------------------------------"
                            + "\nOK, let's announce the release of an SUP Paddle Board"
                            + "\n-----------------------------------------------------------------------------------"
                    );

                    System.out.println(
                            "Please input the SUP product name:"
                    );
                } else {

                    System.out.println(
                            "-----------------------------------------------------------------------------------"
                            + "\nOK, let's announce the release of a new Skateboard Product"
                            + "\n-----------------------------------------------------------------------------------"
                    );

                    //System.out.println("-----------------------------------------------------------------------------------");
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
        System.out.println("-----------------------------------------------------------------------------------");
        return productName;
    }

    public String getLoopOption() {
        Scanner eventOptionScanner = new Scanner(System.in);
        String loopOption = eventOptionScanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("You entered this board type option: " + loopOption);
        return loopOption;
    }
}
