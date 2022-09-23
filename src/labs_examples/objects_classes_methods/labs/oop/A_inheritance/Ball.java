package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Ball {

    private double radius;

    public static final double PI = Math.PI;

    public Ball() {
        radius = 10;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void doSomething() {
        System.out.println("Doing something in ball");
    }

    public double getRadius() {
        return radius;
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getVolume(double radius) {
        return (4.0 /3) * PI * radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                '}';
    }

    public double getSurfaceArea(double radius) {
        return 4 * PI * radius * radius;
    }

}
