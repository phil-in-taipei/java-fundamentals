package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise1Controller {
    public static void main(String[] args) {
        InflatableEllipsoidBall myRugbyBall = new InflatableEllipsoidBall(
                (short) 20, true, (short) 8, "Rugby Ball"
        );

        InflatableEllipsoidBall myDefaultEllipsoidBall = new InflatableEllipsoidBall();

        InflatableSphericalBall myVolleyBall = new InflatableSphericalBall(
                (short) 10, true, "Volley Ball"
        );

        //System.out.println(myVolleyBall.getVolume(myVolleyBall.super.radius));

        InflatableSphericalBall myDefaultSphericalBall = new InflatableSphericalBall();
    }
}

