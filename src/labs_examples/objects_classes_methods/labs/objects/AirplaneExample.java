package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {
    public static void main(String[] args) {

        Airline airline = new Airline("Pan Am", "USA");
        Altimeter altimeter = new Altimeter("Trusty Altimeter", 1995);
        LandingTires landingTires = new LandingTires("Michelin", 2.5);
        AirPlaneEngine airplaneEngine = new AirPlaneEngine(400);
        Airplane myAirplane = new Airplane(landingTires, altimeter, airline,
                airplaneEngine, 200, 100);

        //System.out.println(airline.toString());
        //System.out.println(altimeter.toString());
        //System.out.println(airplaneEngine.toString());
        //System.out.println(landingTires.toString());
        System.out.print(myAirplane.toString());

    }

}
