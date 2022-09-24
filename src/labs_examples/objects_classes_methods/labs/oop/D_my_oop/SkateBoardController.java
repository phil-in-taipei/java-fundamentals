package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SkateBoardController {
    public static void main(String[] args) {

        LandSportingBoard boardTestDefault = new LandSportingBoard();

        LandSportingBoard boardTest = new LandSportingBoard(
                70, 10, 2, "ramp",
                "Powell Peralta", "McTwist", 1988
        );


        Skateboard skateboardTestDefault = new Skateboard();

        Skateboard skateboardTest = new Skateboard(
                80, 8, 2,
                "pavement", "Toy Machine",
                "Lance Hillbert", 2021,
                "vert ramp", 52
        );

        skateboardTest.releaseAnnouncement();
        skateboardTest.releaseAnnouncement("It's finally available!!");
        skateboardTest.onTheMarket(true);
        skateboardTest.setEndOfSupport(730);

        System.out.println("\n" + skateboardTest.toString());
    }
}

