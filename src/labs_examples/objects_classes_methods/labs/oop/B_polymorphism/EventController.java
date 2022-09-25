package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class EventController {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Social Event Default Test:");
        System.out.println("-----------------------------------------------------------------------------------");
        SocialEvent testDefaultSocialEvent = new SocialEvent();
        testDefaultSocialEvent.describeEvent("A Coffee & Code Meetup");
        System.out.println("-----------------------------------------------------------------------------------");
        testDefaultSocialEvent.setEventTime("January 1, 2022");
        testDefaultSocialEvent.setImportanceLevel(5);
        testDefaultSocialEvent.notifyIfAlreadyHappened(true);

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Work Event Default Test:");
        System.out.println("-----------------------------------------------------------------------------------");
        WorkEvent testDefaultWorkEvent = new WorkEvent();
        testDefaultWorkEvent.describeEvent("A Teacher's Meeting");
        System.out.println("-----------------------------------------------------------------------------------");
        testDefaultWorkEvent.setEventTime("December 1, 2022");
        testDefaultWorkEvent.setImportanceLevel(4);
        testDefaultWorkEvent.notifyIfAlreadyHappened(false);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
