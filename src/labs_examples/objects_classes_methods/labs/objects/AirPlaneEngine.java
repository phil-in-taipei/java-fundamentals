package labs_examples.objects_classes_methods.labs.objects;

public class AirPlaneEngine {
    double horsePower;

    public AirPlaneEngine(double horsePower){

        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        return "Airplane Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
