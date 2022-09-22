package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InflatableBall extends Ball {

    private boolean isInflated;


    public InflatableBall() {
        super();
        isInflated = false;
    }

    public InflatableBall(short radius, boolean isInflated) {
        super(radius);
        this.isInflated = isInflated;
    }
}
