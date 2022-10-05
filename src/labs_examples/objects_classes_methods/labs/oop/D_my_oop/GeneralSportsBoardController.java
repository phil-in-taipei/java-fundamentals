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

        printDividingLine();

        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        " -- Welcome to Sport Board System -- "
                        + STANDARD_FORMAT
        );

        printDividingLine();

        while(continueLoop) {
            printContinueUsingSystemPrompt();

            Scanner eventLoopScanner = new Scanner(System.in);
            String letsScheduleSomething = eventLoopScanner.next();


            if (letsScheduleSomething.equalsIgnoreCase("y")) {
                continueLoop = true;
                GeneralSportsBoardController controller = new GeneralSportsBoardController();

                printDividingLine();

                printBoardOptionPrompt();

                String loopOptionInput = controller.getLoopOption();


                if (Objects.equals(loopOptionInput, "1")) {
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

                    StandUpPaddleBoard supProduct = createSUPObj(productNameInput);

                    announceSUPObj(BLACK_TEXT, WHITE_BACKGROUND,
                            supProduct, STANDARD_FORMAT);

                    printDividingLine();
                    supObjects.add(supProduct);

                    System.out.println("The are now: " + supObjects.size() + " sups" );
                    if (supObjects.size() > 0) {
                        printDividingLine();

                        wantToPlaceShippingOrder();
                        String placeAnOrder = eventLoopScanner.next();

                        printDividingLine();
                        while (placeAnOrder.equalsIgnoreCase("y")) {
                            printAvailableSUPS(supObjects);
                            printDividingLine();

                            System.out.println("Which item would you like to ship?");
                            int orderOptionInput = controller.getOrderOption() - 1;

                            // TODO: 9/29/22 error handling to put limit on order amount
                            if (orderOptionInput == 999) {
                                break;
                            }
                            printDividingLine();

                            //announceSUPShippingInfo(supObjects.get(orderOptionInput));
                            try {
                                announceSUPShippingInfo(supObjects.get(orderOptionInput));
                            } catch(IndexOutOfBoundsException exc) {
                                //System.out.println(exc.toString());
                                ShippingInputException inputException = new ShippingInputException();
                                System.out.println(inputException.toString());
                            }

                            printDividingLine();
                            wantToPlaceShippingOrder();

                            placeAnOrder = eventLoopScanner.next();

                            printDividingLine();
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

                    Skateboard skateboardObject = createSkateboardObj(productNameInput);

                    announceSkateboardObj(BLACK_TEXT, WHITE_BACKGROUND,
                            skateboardObject, STANDARD_FORMAT);

                    printDividingLine();

                    skateBoardObjects.add(skateboardObject);
                    System.out.println("The are now: " + skateBoardObjects.size() + " skateboards" );

                    if (skateBoardObjects.size() > 0) {
                        printDividingLine();

                        wantToPlaceShippingOrder();

                        String placeAnOrder = eventLoopScanner.next();

                        while (placeAnOrder.equalsIgnoreCase("y")) {
                            printAvailableSkateboards(skateBoardObjects);

                            printDividingLine();
                            System.out.println("Which item would you like to ship?");
                            int orderOptionInput = controller.getOrderOption() - 1;

                            // TODO: 9/29/22 raise exception instead of this if block 
                            if (orderOptionInput == 999) {
                                break;
                            }
                            printDividingLine();

                            //announceSkateboardShippingInfo(skateBoardObjects.get(orderOptionInput));
                            //throws ShippingInputException
                            try {
                                announceSkateboardShippingInfo(skateBoardObjects.get(orderOptionInput));
                            } catch(IndexOutOfBoundsException exc) {
                                //System.out.println(exc.toString());
                                ShippingInputException inputException = new ShippingInputException();
                                System.out.println(inputException.toString());
                            }

                            printDividingLine();


                            wantToPlaceShippingOrder();
                            placeAnOrder = eventLoopScanner.next();
                            printDividingLine();
                        }
                    }
                }

            } else {
                continueLoop = false;
                printExitMessage(
                        BLACK_TEXT,WHITE_BACKGROUND, STANDARD_FORMAT
                );
            }
        }

    }

    public static void announceSkateboardShippingInfo(Skateboard skateboardObject) {
        skateboardObject.paymentReceivedAnnouncement(2000);
        skateboardObject.hasBeenShipped(true);
        skateboardObject.setExpectedDeliveryDate(21);
        System.out.println("The product has been received: "
                + skateboardObject.hasBeenReceived(false)
        );
    }

    public static void announceSUPShippingInfo(
            StandUpPaddleBoard supObject
    ) {
        supObject.paymentReceivedAnnouncement(2000);
        supObject.hasBeenShipped(true);
        supObject.setExpectedDeliveryDate(21);
        System.out.println("The product has been received: "
                + supObject.hasBeenReceived(false)
        );
    }

    public static void announceSkateboardObj(
            String BLACK_TEXT, String WHITE_BACKGROUND,
            Skateboard skateboardObject, String STANDARD_FORMAT

    ) {
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        "You have created the following skateboard product object:"
                        + STANDARD_FORMAT
                        + "\n"
                        + skateboardObject.toString()
        );
    }

    public static void announceSUPObj(
            String BLACK_TEXT, String WHITE_BACKGROUND,
            StandUpPaddleBoard supProduct, String STANDARD_FORMAT
    ) {
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        "You have created the following SUP product object:"
                        + STANDARD_FORMAT
                        + "\n"
                        + supProduct.toString()
        );
    }

    public static Skateboard createSkateboardObj(String productNameInput) {
        Skateboard skateboardObject = new Skateboard(
                80, 8, 2,
                "pavement", "Toy Machine",
                productNameInput, 2021,
                "vert ramp", 52
        );
        return skateboardObject;
    }

    public static StandUpPaddleBoard createSUPObj(String productNameInput) {
        StandUpPaddleBoard supProduct = new StandUpPaddleBoard(
                80, 8, 2,
                "pavement", productNameInput,
                2022, "Ocean",
                true, 5
        );
        return supProduct;
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

    public static void printAvailableSkateboards(
            ArrayList<Skateboard> skateBoardObjects
    ) {
        System.out.println("These are the skateboards currently available for shipping:");
        printDividingLine();
        int index = 1;
        for (Skateboard s : skateBoardObjects) {
            System.out.println(index + ": " + s.getModelName());
            index++;
        }
    }

    public static void printAvailableSUPS(ArrayList<StandUpPaddleBoard> supObjects) {
        System.out.println("These are the SUP boards currently available for shipping:");
        printDividingLine();
        int index = 1;
        for (StandUpPaddleBoard s : supObjects) {
            System.out.println(index + ": " + s.getModelName());
            index++;
        }
    }

    public static void printBoardOptionPrompt() {
        System.out.println(
                "Please input the board option:"
                        + "\n1) Stand Up Paddle Board (SUP)"
                        + "\n2) Skateboard"
        );
    }

    public static void printContinueUsingSystemPrompt() {
        System.out.println(
                "Do you want to utilize the board purchasing system?"
                        + "\n'Y') Yes"
                        + "\n'N') No thanks, I'm done"
        );
    }

    public static void printDividingLine() {
        System.out.println(
                "-----------------------------------------------------------------------------------"
        );
    }

    public static void printExitMessage(
            String BLACK_TEXT, String WHITE_BACKGROUND,
            String STANDARD_FORMAT) {
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        " -- Exiting Sport Board System -- "
                        + STANDARD_FORMAT
        );
    }

    public static void wantToPlaceShippingOrder() {
        System.out.println(
                "Would you like to place a shipping order?"
                        + "\n'Y') Yes"
                        + "\n'N') No thanks, I'm done"
        );
    }
}
