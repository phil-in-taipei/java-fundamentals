package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public interface ProductRelease {
    public boolean onTheMarket(boolean isOnTheMarket);
    public void releaseAnnouncement();
    public void releaseAnnouncement(String customReleaseAnnouncement);
    public void discontinueAnnouncement();
    public void setEndOfSupport(int days);
}
