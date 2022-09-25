package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class WorkEvent extends Event{

    String eventDescription;
    String eventTime;

    int importanceLevel;

    boolean alreadyHappened;

    public void describeEvent(String eventDescription) {
        System.out.println("Work event: " + eventDescription);
        this.eventDescription = eventDescription;
    };
    public void setEventTime(String eventTime) {
        System.out.println("The work event will occur on: " + eventTime);
        this.eventTime = eventTime;
    };
    public void setImportanceLevel(int importanceLevel) {
        System.out.println("The work event is this important: " + importanceLevel);
        this.importanceLevel = importanceLevel;
    };
    public void notifyIfAlreadyHappened(boolean alreadyHappened) {
        System.out.println("The work event has already happened: " + alreadyHappened);
        this.alreadyHappened = alreadyHappened;
    };
}
