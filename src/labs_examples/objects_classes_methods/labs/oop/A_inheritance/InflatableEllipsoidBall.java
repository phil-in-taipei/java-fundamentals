package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InflatableEllipsoidBall extends InflatableBall{
    private short shortRadius;
    private String nameOfBall;

    public InflatableEllipsoidBall() {
        super();
        shortRadius = 5;
        nameOfBall = "StandardEllipsoidBall";
    }

    public InflatableEllipsoidBall(short radius, boolean isInflated, short shortRadius, String nameOfBall) {
        super(radius, isInflated);
        this.shortRadius = shortRadius;
        this.nameOfBall = nameOfBall;
    }


}
