package labs_examples.objects_classes_methods.labs.oop.A_inheritance;


import static java.lang.Math.pow;

public class InflatableEllipsoidBall extends InflatableBall{
    private double shortRadius;
    private String nameOfBall;

    public InflatableEllipsoidBall() {
        super();
        shortRadius = 5;
        nameOfBall = "StandardEllipsoidBall";
    }

    public InflatableEllipsoidBall(double radius, boolean isInflated, double shortRadius, String nameOfBall) {
        super(radius, isInflated);
        this.shortRadius = shortRadius;
        this.nameOfBall = nameOfBall;
    }

    public String getNameOfBall() {
        return nameOfBall;
    }

    public void setShortRadius(double shortRadius) {
        this.shortRadius = shortRadius;
    }

    public void setNameOfBall(String nameOfBall) {
        this.nameOfBall = nameOfBall;
    }

    public double getShortRadius() {
        return shortRadius;
    }

    //@Override -- because overloading not overriding??
    public double getVolume(double radius, double shortRadius) {
        return findEllipsoidVolume(radius, shortRadius);
    }

    @Override
    public String toString() {
        return "InflatableEllipsoidBall{" +
                "shortRadius=" + shortRadius +
                " radius=" + this.getRadius() +
                ", nameOfBall= '" + nameOfBall + '\'' +
                '}';
    }

    //@Override -- because overloading not overriding??
    public double getSurfaceArea(double radius, double shortRadius) {
        // modifies to return ellipsoid volume
        return findEllipsoidSurfaceArea(shortRadius, radius, radius);
    }

    public double findEllipsoidVolume(double a, double b) {
        return 4 * PI * a * a * b;
    }

    public static double findEllipsoidSurfaceArea(double a, double b, double c) {

        // Formula to find surface area
        // of an Ellipsoid
        double area = 4 * 3.141592653
                * pow((pow(a * b, 1.6) + pow(a * c, 1.6)
                        + pow(b * c, 1.6))
                        / 3,
                1 / 1.6);


        return area;
    }
}
