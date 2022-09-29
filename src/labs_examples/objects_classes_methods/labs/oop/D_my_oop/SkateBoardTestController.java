package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class SkateBoardTestController {
    public static void main(String[] args) {

        String BLACK_TEXT = "\u001B[30m";
        String WHITE_BACKGROUND = "\u001B[47m";
        String STANDARD_FORMAT = "\u001B[0m";
        System.out.println(
                "--------------------------------------------------------------------"
                        + "\n********************************************************************"
                        + "\n--------------------------------------------------------------------"
        );
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        "Testing Skateboard Controller ....." +
                        STANDARD_FORMAT
        );
        System.out.println(
                "--------------------------------------------------------------------"
                + "\n********************************************************************"
                + "\n--------------------------------------------------------------------"
        );
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        "Testing parent object creation" +
                        STANDARD_FORMAT
        );

        LandSportingBoard boardTestDefault = new LandSportingBoard();
        System.out.println(
                "--------------------------------------------------------------------"
                + "\nDefault parent object creation works!"
                + "\n--------------------------------------------------------------------\n"
                + boardTestDefault.toString()
        );


        LandSportingBoard boardTest = new LandSportingBoard(
                70, 10, 2, "ramp",
                "Powell Peralta", "McTwist", 1988
        );


        System.out.println(
                "--------------------------------------------------------------------"
                + "\nCustom parent object creation works!"
                + "\n--------------------------------------------------------------------\n"
                + boardTest.toString()
        );

        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        "Testing Skateboard classes ....." +
                        STANDARD_FORMAT
        );

        Skateboard skateboardTestDefault = new Skateboard();
        System.out.println(
                "--------------------------------------------------------------------"
                        + "\nDefault skatebord object creation works!"
                        + "\n--------------------------------------------------------------------\n"
                        + skateboardTestDefault.toString()
        );


        Skateboard skateboardTest = new Skateboard(
                80, 8, 2,
                "pavement", "Toy Machine",
                "Lance Hillbert", 2021,
                "vert ramp", 52
        );

        skateboardTest.setWheelMilimeterRadius(52.5);
        skateboardTest.setIntendedUse("mini-halfpipe");

        System.out.println(
                "--------------------------------------------------------------------"
                        + "\nCustom skateboard object creation  and resetting works!"
                        + "\n--------------------------------------------------------------------\n"
                        + skateboardTest.toString()
        );

        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        "Now testing product announcement interface implementation:"
                        + STANDARD_FORMAT
        );
        System.out.println("--------------------------------------------------------------------");
        skateboardTest.releaseAnnouncement("It's finally available!!");
        skateboardTest.onTheMarket(true);
        skateboardTest.setEndOfSupport(900);
        skateboardTestDefault.discontinueAnnouncement();

        System.out.println("--------------------------------------------------------------------");
        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        "Now testing product purchasing interface implementation:"
                        + STANDARD_FORMAT
        );
        System.out.println("--------------------------------------------------------------------");
        skateboardTest.paymentReceivedAnnouncement(2000);
        skateboardTest.hasBeenShipped(true);
        System.out.println(
                "The shipment has been received: "
                + skateboardTest.hasBeenReceived(true)
        );

    }



}

