package labs_examples.objects_classes_methods.labs.objects;

public class Altimeter {

    private String altimeterName;
    private int yearCreated;

    public void setAltimeterName(String altimeterName) {
        this.altimeterName = altimeterName;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public Altimeter(String altimeterName, int yearCreated){

        this.altimeterName = altimeterName;
        this.yearCreated = yearCreated;;

    }

    public String getAltimeterName() {
        return altimeterName;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    @Override
    public String toString() {
        return "Altimeter{" +
                "altimeterName=" + altimeterName +
                "yearCreated=" + yearCreated +
                '}';
    }
}
