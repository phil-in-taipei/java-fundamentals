package labs_examples.objects_classes_methods.labs.objects;

public class Airline {
    String airlineName;
    String airlineNationality;

    public Airline(String airlineName, String airlineNationality){

        this.airlineName = airlineName;
        this.airlineNationality = airlineNationality;;

    }

    @Override
    public String toString() {
        return "Airline{" +
                "airlineName=" + airlineName +
                "airlineNationality=" + airlineNationality +
                '}';
    }
}
