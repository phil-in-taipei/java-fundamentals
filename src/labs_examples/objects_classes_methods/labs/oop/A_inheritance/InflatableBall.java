package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InflatableBall extends Ball {

    private boolean isInflated;


    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    @Override
    public String toString() {
        return "InflatableBall{" +
                "isInflated=" + isInflated +
                "radius=" + this.getRadius() +
                '}';
    }

    public boolean isInflated() {
        return isInflated;
    }

    public InflatableBall() {
        super();
        isInflated = false;
    }

    public void doSomething() {
        System.out.println("Doing something in inflatable ball");
    }

    public InflatableBall(double radius, boolean isInflated) {
        super(radius);
        System.out.println("Constructor of inflatable ball");
        this.isInflated = isInflated;
    }
}
