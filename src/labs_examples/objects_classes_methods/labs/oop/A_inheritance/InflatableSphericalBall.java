package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InflatableSphericalBall extends InflatableBall {
    private String nameOfBall;

    public void setNameOfBall(String nameOfBall) {
        this.nameOfBall = nameOfBall;
    }

    public String getNameOfBall() {
        return nameOfBall;
    }

    @Override
    public String toString() {
        return "InflatableSphericalBall{" +
                "radius= '" + this.getRadius() + '\'' +
                " nameOfBall= '" + nameOfBall + '\'' +
                '}';
    }

    public InflatableSphericalBall() {
        super();
        nameOfBall = "StandardBall";
    };

    public InflatableSphericalBall(double radius, boolean isInflated, String nameOfBall) {
        super(radius, isInflated);
        System.err.println("Constructor of inflatable spherical ball");
        this.nameOfBall = nameOfBall;
    }
}
