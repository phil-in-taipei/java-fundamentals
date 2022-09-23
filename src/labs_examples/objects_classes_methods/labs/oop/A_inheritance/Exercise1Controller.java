package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise1Controller {
    public static void main(String[] args) {


        System.out.println(
                "\n" + "---------------------------------------------------------------------------------"
        );
        InflatableSphericalBall myVolleyBall = new InflatableSphericalBall(
                (short) 12, true, "Volley Ball"
        );

        //System.out.println("Now using parent type to initialize child:");

        //InflatableBall myVolleyBallExp = new InflatableSphericalBall(
        //        (short) 12, true, "Volley Ball"
        //);

        //myVolleyBallExp.doSomething();

        InflatableSphericalBall myDefaultSphericalBall = new InflatableSphericalBall();

        System.out.println(
                "This is a default inflatable spherical ball: \n" +
                myDefaultSphericalBall.toString());

        System.out.println("---------------------------------------------------------------------------------"
        );

        System.out.println(
                "This is a volley ball: \n" + myVolleyBall.toString() +
                "\nThe volume of the volley ball is: "
                + myVolleyBall.getVolume(myVolleyBall.getRadius())
                + "\nThe surface area of the volley ball is: " +
                myVolleyBall.getVolume(myVolleyBall.getSurfaceArea(myVolleyBall.getRadius()))
        );

        System.out.println("---------------------------------------------------------------------------------"
        );

        InflatableEllipsoidBall myDefaultEllipsoidBall = new InflatableEllipsoidBall();
        System.out.println("This is a default inflatable ellipsoid ball: \n"
                + myDefaultEllipsoidBall.toString());

        InflatableEllipsoidBall myRugbyBall = new InflatableEllipsoidBall(
                (short) 20, true, (short) 8, "Rugby Ball"
        );

        System.out.println("---------------------------------------------------------------------------------"
        );

        System.out.println(
                "This is a rugby ball: \n" + myRugbyBall.toString() +
                        "\nThe volume of the rugby ball is: " +
                        myRugbyBall.getVolume(
                                myRugbyBall.getRadius(), myRugbyBall.getShortRadius()
                        ) + "\nThe Surface area of the rugby ball is: " +
                        myRugbyBall.getSurfaceArea(
                                myRugbyBall.getRadius(), myRugbyBall.getShortRadius()
                        )
        );
    }
}

