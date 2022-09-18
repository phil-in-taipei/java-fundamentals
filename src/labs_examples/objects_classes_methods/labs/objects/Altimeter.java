package labs_examples.objects_classes_methods.labs.objects;

public class Altimeter {

    String altimeterName;
    int yearCreated;

    public Altimeter(String altimeterName, int yearCreated){

        this.altimeterName = altimeterName;
        this.yearCreated = yearCreated;;

    }

    @Override
    public String toString() {
        return "Altimeter{" +
                "altimeterName=" + altimeterName +
                "yearCreated=" + yearCreated +
                '}';
    }
}
