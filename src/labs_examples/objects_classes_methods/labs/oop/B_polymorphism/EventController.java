package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackController;

import java.util.Scanner;

public class EventController {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println(
                "-----------------------------------------------------------------------------------"
                + "\n***********************************************************************************"
                + "\n-----------------------------------------------------------------------------------"
        );

        SocialEvent userInputSocialEvent = new SocialEvent();

        System.out.println("Please input the name of the social event you want to schedule:");
        EventController controller = new EventController();
        String eventName = controller.getEventName();
        //SocialEvent testDefaultSocialEvent = new SocialEvent();
        userInputSocialEvent.describeEvent(eventName);
        System.out.println("-----------------------------------------------------------------------------------");
        userInputSocialEvent.setEventTime("January 10, 2022");
        userInputSocialEvent.setImportanceLevel(5);
        userInputSocialEvent.notifyIfAlreadyHappened(true);
        //player.setName(name);
        //String name = controller.getPlayerName();
        //player.setName(name);

        //System.out.println("-----------------------------------------------------------------------------------");
        //System.out.println("Work Event Default Test:");
        //System.out.println("-----------------------------------------------------------------------------------");
        //WorkEvent testDefaultWorkEvent = new WorkEvent();
        //testDefaultWorkEvent.describeEvent("A Teacher's Meeting");
        //System.out.println("-----------------------------------------------------------------------------------");
        //testDefaultWorkEvent.setEventTime("December 1, 2022");
        //testDefaultWorkEvent.setImportanceLevel(4);
        //testDefaultWorkEvent.notifyIfAlreadyHappened(false);
        System.out.println("-----------------------------------------------------------------------------------");

        WorkEvent userInputWorkEvent = new WorkEvent();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Work Event Input:");
        eventName = controller.getEventName();
        userInputWorkEvent.describeEvent(eventName);
        userInputWorkEvent.setEventTime("December 1, 2022");
        userInputWorkEvent.setImportanceLevel(4);
        userInputWorkEvent.notifyIfAlreadyHappened(false);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public String getEventName() {
        Scanner scanner = new Scanner(System.in);
        String eventNameName = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("You entered this event name: " + eventNameName);
        return eventNameName;

    }
}
