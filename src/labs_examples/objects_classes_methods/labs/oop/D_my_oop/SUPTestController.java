package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class SUPTestController {


    public static void main(String[] args) {

        String BLACK_TEXT = "\u001B[30m";
        String WHITE_BACKGROUND = "\u001B[47m";
        String STANDARD_FORMAT = "\u001B[0m";

        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                "Testing SUP Controller ....." +
                        STANDARD_FORMAT
        );
        WaterSportingBoard boardTestDefault = new WaterSportingBoard();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Default object creation works!");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Created: \n" + boardTestDefault.toString());


        WaterSportingBoard boardTest = new WaterSportingBoard(
                70, 10, 2, "ramp",
                "Powell Peralta", 2018, "Lake"
        );


        StandUpPaddleBoard supTestDefault = new StandUpPaddleBoard();

        StandUpPaddleBoard supTest = new StandUpPaddleBoard(
                80, 8, 2,
                "pavement", "Starboard 2000",
                2022, "Ocean",
                true, 5
        );
        supTest.setOneToFiveDurability(4);
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                "Custom object creation with subsequent resetting of variables works!"
                + STANDARD_FORMAT

        );
        System.out.println("--------------------------------------------------------------------");
        System.out.println(supTest.toString());
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                "Now testing product announcement interface implementation:"
                + STANDARD_FORMAT
        );
        System.out.println("--------------------------------------------------------------------");
        supTest.releaseAnnouncement();
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                "Ths product is on the market: " + supTest.onTheMarket(true)

        );
        supTest.setEndOfSupport(600);
        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                "Now testing product purchasing interface implementation:"
                + STANDARD_FORMAT
        );
        System.out.println("--------------------------------------------------------------------");
        supTest.paymentReceivedAnnouncement(2000);
        supTest.hasBeenShipped(true);
        supTest.setExpectedDeliveryDate(21);
        System.out.println("The product has been received: "
                + supTest.hasBeenReceived(false)
        );
        System.out.println("--------------------------------------------------------------------");

    }


}
