package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InflatableSphericalBall extends InflatableBall {
    private String nameOfBall;

    public InflatableSphericalBall() {
        super();
        nameOfBall = "StandardBall";
    };

    public InflatableSphericalBall(short radius, boolean isInflated, String nameOfBall) {
        super(radius, isInflated);
        this.nameOfBall = nameOfBall;
    }
}
