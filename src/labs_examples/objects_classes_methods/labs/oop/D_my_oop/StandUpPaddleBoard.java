package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class StandUpPaddleBoard extends WaterSportingBoard implements ProductPurchasingInformation, ProductRelease {

    private boolean isInflatable;
    private int oneToFiveDurability;

    String ID;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    StandUpPaddleBoard() {
        isInflatable = false;
        ID = "SUP" + IDNumber.generateIDNumber(11);
        oneToFiveDurability = 2;
    }

    @Override
    public String toString() {
        return "StandUpPaddleBoard{" +
                "\n isInflatable=" + isInflatable +
                ", \n oneToFiveDurability=" + oneToFiveDurability +
                ", \n bodyOfWaterUseType='" + bodyOfWaterUseType + '\'' +
                ", \n brandName='" + brandName + '\'' +
                ", \n modelName='" + modelName + '\'' +
                ", \n ID='" + ID + '\'' +
                ", \n yearReleased=" + yearReleased + "\n " +
                '}';
    }

    public void setInflatable(boolean inflatable) {
        isInflatable = inflatable;
    }

    public void setOneToFiveDurability(int oneToFiveDurability) {
        this.oneToFiveDurability = oneToFiveDurability;
    }

    public boolean isInflatable() {
        return isInflatable;
    }

    public int getOneToFiveDurability() {
        return oneToFiveDurability;
    }

    StandUpPaddleBoard(double length, double width,
                       double thickness, String brandName,
                       String modelName, int yearReleased,
                       String bodyOfWaterUseType, boolean isInflatable,
                       int oneToFiveDurability) {
        super(length, width, thickness, brandName,
                modelName, yearReleased, bodyOfWaterUseType);
        this.isInflatable = isInflatable;
        this.ID = "SUP" + IDNumber.generateIDNumber(11);
        this.oneToFiveDurability = oneToFiveDurability;
    }


    @Override
    public boolean hasBeenShipped(boolean confirmationOfShipping) {
        System.out.println(
                "Product " + this.ID + "has been shipped: "
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
        System.out.println("The product will be deliverd in " + days + " days!");
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
        // write code here to accelerate the vehicle
        System.out.println("The product is no longer released as of today!");
    }

    @Override
    public boolean onTheMarket(boolean isOnTheMarket) {
        return isOnTheMarket;
    }

    @Override
    public void setEndOfSupport(int days) {
        System.out.println("Maintenance and support will end in " + days + " days!");
    }



}

