package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GeneralSportsBoardController {

    static boolean continueLoop = true;

    static ArrayList<StandUpPaddleBoard> supObjects = new ArrayList<StandUpPaddleBoard>();
    static ArrayList<Skateboard> skateBoardObjects = new ArrayList<Skateboard>();

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
                    supObjects.add(supProduct);
                    System.out.println("The are now: " + supObjects.size() + " sups" );
                    if (supObjects.size() > 0) {
                        printDividingLine();
                        System.out.println(
                                "Would you like to place a shipping order?"
                                        + "\n'Y') Yes"
                                        + "\n'N') No thanks, I'm done" //getOrderOption
                        );
                        String placeAnOrder = eventLoopScanner.next();
                        printDividingLine();
                        if (placeAnOrder.equalsIgnoreCase("y")) {
                            System.out.println("These are the SUP boards currently available for shipping:");
                            int index = 1;
                            for (StandUpPaddleBoard s : supObjects) {
                                System.out.println(index + ": " + s.getModelName());
                                index++;
                            }
                            printDividingLine();
                            System.out.println("Which item would you like to ship?");
                            int orderOptionInput = controller.getOrderOption() - 1;
                            if (orderOptionInput == 999) {
                                break;
                            }
                            printDividingLine();
                            supObjects.get(orderOptionInput).paymentReceivedAnnouncement(2000);
                            supObjects.get(orderOptionInput).hasBeenShipped(true);
                            supObjects.get(orderOptionInput).setExpectedDeliveryDate(21);
                            System.out.println("The product has been received: "
                                    + supObjects.get(orderOptionInput).hasBeenReceived(false)
                            );
                            printDividingLine();
                        } else {
                            break;
                        }

                    }
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
                                    "You have created the following skateboard product object:"
                                    + STANDARD_FORMAT
                                    + "\n"
                                    + skateboardObject.toString()
                    );
                    printDividingLine();
                    skateBoardObjects.add(skateboardObject);
                    System.out.println("The are now: " + skateBoardObjects.size() + " skateboards" );
                    printDividingLine();
                    if (skateBoardObjects.size() > 0) {
                        printDividingLine();
                        System.out.println(
                                "Would you like to place a shipping order?"
                                        + "\n'Y') Yes"
                                        + "\n'N') No thanks, I'm done" //getOrderOption
                        );
                        String placeAnOrder = eventLoopScanner.next();

                        printDividingLine();
                        if (placeAnOrder.equalsIgnoreCase("y")) {
                            System.out.println("These are the skateboards currently available for shipping:");
                            int index = 1;
                            for (Skateboard s : skateBoardObjects) {
                                System.out.println(index + ": " + s.getModelName());
                                index++;
                            }
                            printDividingLine();
                            System.out.println("Which item would you like to ship?");
                            int orderOptionInput = controller.getOrderOption() - 1;
                            if (orderOptionInput == 999) {
                                break;
                            }
                            printDividingLine();
                            skateBoardObjects.get(orderOptionInput).paymentReceivedAnnouncement(2000);
                            skateBoardObjects.get(orderOptionInput).hasBeenShipped(true);
                            skateBoardObjects.get(orderOptionInput).setExpectedDeliveryDate(21);
                            System.out.println("The product has been received: "
                                    + skateBoardObjects.get(orderOptionInput).hasBeenReceived(false)
                            );
                            printDividingLine();
                        } else {
                            System.out.println(
                                    BLACK_TEXT + WHITE_BACKGROUND +
                                            " -- Exiting Sport Board System -- "
                                            + STANDARD_FORMAT
                            );
                            break;
                        }

                    }
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

    public int getOrderOption() {
        Scanner eventOptionScanner = new Scanner(System.in);
        String orderOption = eventOptionScanner.nextLine();
        int orderOptionInt;
        printDividingLine();
        System.out.println("You entered this order choice: " + orderOption);
        try {
            orderOptionInt = Integer.parseInt(orderOption);
        }
        catch (NumberFormatException e) {
            orderOptionInt = 1000;
            System.out.println("Invalid input");
        }
        return orderOptionInt;
    }

    public static void printDividingLine() {
        System.out.println(
                "-----------------------------------------------------------------------------------"
        );
    }
}
