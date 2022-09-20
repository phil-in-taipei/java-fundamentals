package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {
    public static void main(String[] args) {

        Airline airline = new Airline("Pan Am", "USA");
        Altimeter altimeter = new Altimeter("Trusty Altimeter", 1995);
        LandingTires landingTires = new LandingTires("Michelin", 2.5);
        //double tireRadius = landingTires.getTireRadius();
        AirPlaneEngine airplaneEngine = new AirPlaneEngine(400);
        Airplane myAirplane = new Airplane(landingTires, altimeter, airline,
                airplaneEngine, 200, 100);

        //System.out.println(airline.toString());
        //System.out.println(altimeter.toString());
        //System.out.println(airplaneEngine.toString());
        //System.out.println(landingTires.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println("This is the airplane:");
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        System.out.print(myAirplane.toString());
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("This is the tire radius of the object: " +
                landingTires.getTireRadius());
        landingTires.setTireRadius(landingTires.getTireRadius() * 2);
        System.out.println("-----------------------------------------------------");
        System.out.println("Now the radius is doubled");
        System.out.println("This is the tire radius of the object: "
                            + landingTires.getTireRadius());

        // setAirlineNationality getHorsePower setYearCreated
        System.out.println("-----------------------------------------------------");
        System.out.println("This is nationality of the airline in the object: " +
                airline.getAirlineNationality());
        airline.setAirlineNationality("United States");
        System.out.println("-----------------------------------------------------");
        System.out.println("Now the nationality is more verbose");
        System.out.println("This is nationality of the airline in the object: " +
                airline.getAirlineNationality());

        System.out.println("-----------------------------------------------------");
        System.out.println("This is horsepower of the engine in the object: " +
                airplaneEngine.getHorsePower());
        airplaneEngine.setHorsePower(airplaneEngine.getHorsePower() * 2);
        System.out.println("-----------------------------------------------------");
        System.out.println("Now the horsepower is doubled");
        System.out.println("This is horsepower of the engine in the object: " +
                airplaneEngine.getHorsePower());

        System.out.println("-----------------------------------------------------");
        System.out.println("This is year of the altimeter in the object: " +
                altimeter.getYearCreated());
        altimeter.setYearCreated(altimeter.getYearCreated() + 1);
        System.out.println("-----------------------------------------------------");
        System.out.println("Now the the altimeter year is one more recent");
        System.out.println("This is year of the altimeter in the object: " +
                altimeter.getYearCreated());

        System.out.println("-----------------------------------------------------");
        System.out.println("This is the updated airplane:");
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        System.out.print(myAirplane.toString());
        System.out.println("");
        System.out.println("-----------------------------------------------------");
    }

}
