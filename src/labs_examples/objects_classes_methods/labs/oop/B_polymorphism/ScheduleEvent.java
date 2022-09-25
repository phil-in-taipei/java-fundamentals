package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public interface ScheduleEvent {
    public void describeEvent(String eventDescription);
    public void setEventTime(String eventTime);
    public void setImportanceLevel(int importanceLevel);
    public void notifyIfAlreadyHappened(boolean alreadyHappened);
}
