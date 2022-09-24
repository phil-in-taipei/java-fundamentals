package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SUPController {
    public static void main(String[] args) {
        WaterSportingBoard boardTestDefault = new WaterSportingBoard();

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
        System.out.println(supTest.toString());
        supTest.paymentReceivedAnnouncement(3000);
        System.out.println("The product has been shipped: " +
                supTest.hasBeenShipped(true));
        System.out.println("The product has been received: " +
                supTest.hasBeenReceived(false)
        );
        supTest.setExpectedDeliveryDate(14);
    }


}
