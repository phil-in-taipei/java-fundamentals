package labs_examples.objects_classes_methods.labs.objects;

public class LandingTires {

    private String tireCompany;
    private double tireRadius;

    public void setTireCompany(String tireCompany) {
        this.tireCompany = tireCompany;
    }

    public void setTireRadius(double tireRadius) {
        this.tireRadius = tireRadius;
    }

    public String getTireCompany() {
        return tireCompany;
    }

    public double getTireRadius() {
        return tireRadius;
    }

    public LandingTires(String tireCompany, double tireRadius){

        this.tireCompany = tireCompany;
        this.tireRadius = tireRadius;;

    }

    @Override
    public String toString() {
        return "LandingTires { " +
                "tireCompany = " + tireCompany +
                "tireRadius = " + tireRadius +
                " }";
    }
}
