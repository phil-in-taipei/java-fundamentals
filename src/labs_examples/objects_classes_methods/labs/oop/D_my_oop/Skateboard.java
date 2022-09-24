package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Skateboard extends LandSportingBoard implements ProductRelease{

    double wheelMilimeterRadius;
    String intendedUse;



    public boolean onTheMarket(boolean isOnTheMarket) {
        System.out.println("The skateboard is on the market");
        return isOnTheMarket;
    }

    @Override
    public void releaseAnnouncement() {
        System.out.println("The product is being released today!");
    }

    @Override
    public String toString() {
        return "Skateboard{" +
                "\n wheelMilimeterRadius=" + wheelMilimeterRadius +
                ", \n intendedUse='" + intendedUse + '\'' +
                ", \n terrainType='" + terrainType + '\'' +
                ", \n brandName='" + brandName + '\'' +
                ", \n modelName='" + modelName + '\'' +
                ", \n yearReleased=" + yearReleased + "\n" +
                '}';
    }

    public void releaseAnnouncement(String customReleaseAnnouncement) {
        System.out.println(customReleaseAnnouncement);
    }
    @Override
    public void discontinueAnnouncement() {
        // write code here to accelerate the vehicle
        System.out.println("The product is no longer released as of today!");
    }

    @Override
    public void setEndOfSupport(int days) {
        System.out.print("Maintenance and support will end in " + days + " days!");
    }


    Skateboard() {
        super();
        this.wheelMilimeterRadius = 54;
        this.intendedUse = "Street Skating";

    }

    Skateboard(double length, double width,
               double thickness, String terrainType,
               String brandName, String modelName,
               int yearReleased, String intendedUse,
               int wheelMilimeterRadius) {
        super(length, width, thickness, terrainType, brandName, modelName, yearReleased);
        this.intendedUse = intendedUse;
        this.wheelMilimeterRadius = wheelMilimeterRadius;

    }

    public void setWheelMilimeterRadius(double wheelMilimeterRadius) {
        this.wheelMilimeterRadius = wheelMilimeterRadius;
    }

    public void setIntendedUse(String intendedUse) {
        this.intendedUse = intendedUse;
    }

    public double getWheelMilimeterRadius() {
        return wheelMilimeterRadius;
    }

    public String getIntendedUse() {
        return intendedUse;
    }
}
