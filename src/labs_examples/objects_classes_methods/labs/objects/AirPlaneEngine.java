package labs_examples.objects_classes_methods.labs.objects;

public class AirPlaneEngine {
    private double horsePower;

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public AirPlaneEngine(double horsePower){

        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        return "Airplane Engine {" +
                " horsePower = " + horsePower +
                " }";
    }
}
