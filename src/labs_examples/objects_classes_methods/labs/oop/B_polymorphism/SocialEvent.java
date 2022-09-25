package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SocialEvent extends Event{
    public void describeEvent(String eventDescription) {
        System.out.println("Social event: " + eventDescription);
    };
    public void setEventTime(String eventTime) {
        System.out.println("This social event will occur on: " + eventTime);
    };
    public void setImportanceLevel(int importanceLevel) {
        System.out.println("This social event is this important: " + importanceLevel);
    };
    public void notifyIfAlreadyHappened(boolean alreadyHappened) {
        System.out.println("This social event has already happened: " + alreadyHappened);
    };
}
