package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    LandingTires landingTires;

    Altimeter altimeter;

    AirPlaneEngine airPlaneEngine;

    Airline airline;

    double fuelCapacity;

    double currentFuelLevel;

    public Airplane(LandingTires landingTires, Altimeter altimeter,
                    Airline airline, AirPlaneEngine airPlaneEngine,
                    double fuelCapacity, double currentFuelLevel){

        this.landingTires = landingTires;

        this.altimeter = altimeter;

        this.airPlaneEngine = airPlaneEngine;

        this.airline = airline;

        this.fuelCapacity = fuelCapacity;

        this.currentFuelLevel = currentFuelLevel;

    }


    @Override
    public String toString() {
        return "Airplane{" +
                "landingTires= " + landingTires.toString() +
                ",\n altimeter= " + altimeter.toString() +
                ",\n airline= " + airline.toString() + '\'' +
                ",\n airPlaneEngine= " + airPlaneEngine.toString() + '\'' +
                ",\n fuelCapacity= " + fuelCapacity + '\'' +
                ",\n currentFuelLevel= " + currentFuelLevel + '\'' +
                '}';
    }
}
