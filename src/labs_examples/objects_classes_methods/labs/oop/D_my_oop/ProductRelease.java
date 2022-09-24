package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public interface ProductRelease {
    public boolean onTheMarket(boolean isOnTheMarket);
    public void releaseAnnouncement();
    public void discontinueAnnouncement();
    public void setEndOfSupport(int days);
}
