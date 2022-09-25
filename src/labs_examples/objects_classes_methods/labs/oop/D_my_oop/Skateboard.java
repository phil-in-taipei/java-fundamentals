package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Skateboard extends LandSportingBoard implements ProductPurchasingInformation, ProductRelease {

    private double wheelMilimeterRadius;
    private String intendedUse;
    private String ID;



    @Override
    public String toString() {
        return "Skateboard{" +
                "\n wheelMilimeterRadius=" + wheelMilimeterRadius +
                ", \n intendedUse='" + intendedUse + '\'' +
                ", \n terrainType='" + terrainType + '\'' +
                ", \n brandName='" + brandName + '\'' +
                ", \n modelName='" + modelName + '\'' +
                ", \n ID='" + ID + '\'' +
                ", \n yearReleased=" + yearReleased + "\n" +
                '}';
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    Skateboard() {
        super();
        //IDNumber idNumber = New IDNumber
        this.ID = "SK" + IDNumber.generateIDNumber(12, true);
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
        this.ID = "SK" + IDNumber.generateIDNumber(12, true);

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


    @Override
    public boolean hasBeenShipped(boolean confirmationOfShipping) {
        System.out.println(
                "The product " + this.ID + "has been shipped: "
                        + confirmationOfShipping
        );
        return confirmationOfShipping;
    }

    @Override
    public void paymentReceivedAnnouncement(double payment) {
        System.out.println("A payment of " + payment + " has been received!");
    }
    @Override
    public void setExpectedDeliveryDate(int days) {
        System.out.println("The product will be delivered in " + days + " days!");
    }

    @Override
    public boolean hasBeenReceived(boolean confirmationOfDelivery) {
        //System.out.println("The product has been received!");
        return confirmationOfDelivery;
    }


    @Override
    public void releaseAnnouncement() {
        System.out.println(
                "Product " + this.getID() + " is being released today!"
                        + "\n" + this.toString()
        );
    }

    @Override
    public void releaseAnnouncement(String customReleaseAnnouncement) {
        System.out.println(customReleaseAnnouncement);
        System.out.println(
                "Product " + this.getID() + " is being released today!"
                        + "\n" + this.toString()
        );
    }
    @Override
    public void discontinueAnnouncement() {
        System.out.println("Product (" + this.ID + ") is no longer released as of today!");
    }

    @Override
    public boolean onTheMarket(boolean isOnTheMarket) {
        System.out.println("The skateboard is on the market");
        return isOnTheMarket;
    }

    @Override
    public void setEndOfSupport(int days) {
        System.out.println("Maintenance and support will end in " + days + " days!");
    }

}
