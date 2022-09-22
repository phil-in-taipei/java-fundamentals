package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Ball {

    private short radius;

    public static final double PI = 3.14159265358979323846;

    public Ball() {
        radius = 10;
    }

    public Ball(short radius) {
        this.radius = radius;
    }

    public static double getVolume(short radius) {
        return (4.0 /3) * PI * radius;
    }

}
