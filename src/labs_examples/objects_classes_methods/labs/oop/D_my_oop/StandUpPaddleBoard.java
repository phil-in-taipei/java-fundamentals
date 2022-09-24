package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class StandUpPaddleBoard extends WaterSportingBoard implements ProductPurchasingInformation{ //  implements ProductRelease

    private boolean isInflatable;
    private int oneToFiveDurability;

    StandUpPaddleBoard() {
        isInflatable = false;
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
        this.oneToFiveDurability = oneToFiveDurability;
    }

    @Override
    public boolean hasBeenShipped(boolean confirmationOfShipping) {
        //System.out.println("The product has been shipped: " + confirmationOfShipping);
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

    public boolean hasBeenReceived(boolean confirmationOfDelivery) {
        //System.out.println("The product has been received!");
        return confirmationOfDelivery;
    }
}

