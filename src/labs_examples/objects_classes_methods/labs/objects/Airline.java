package labs_examples.objects_classes_methods.labs.objects;

public class Airline {
    private String airlineName;
    private String airlineNationality;

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setAirlineNationality(String airlineNationality) {
        this.airlineNationality = airlineNationality;
    }

    public String getAirlineNationality() {
        return airlineNationality;
    }

    public Airline(String airlineName, String airlineNationality){

        this.airlineName = airlineName;
        this.airlineNationality = airlineNationality;;

    }

    @Override
    public String toString() {
        return "Airline {" +
                "airlineName = " + airlineName +
                "airlineNationality = " + airlineNationality +
                " }";
    }
}
