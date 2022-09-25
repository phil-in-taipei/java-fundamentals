package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public interface ProductPurchasingInformation {

    public boolean hasBeenShipped(boolean confirmationOfShipping);
    public void paymentReceivedAnnouncement(double payment);
    public void setExpectedDeliveryDate(int days);
    public boolean hasBeenReceived(boolean confirmationOfDelivery);

}
