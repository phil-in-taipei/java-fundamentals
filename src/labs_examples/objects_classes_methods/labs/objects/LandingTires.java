package labs_examples.objects_classes_methods.labs.objects;

public class LandingTires {

    String tireCompany;
    double tireRadius;

    public LandingTires(String tireCompany, double tireRadius){

        this.tireCompany = tireCompany;
        this.tireRadius = tireRadius;;

    }

    @Override
    public String toString() {
        return "LandingTires{" +
                "tireCompany=" + tireCompany +
                "tireRadius=" + tireRadius +
                '}';
    }
}
