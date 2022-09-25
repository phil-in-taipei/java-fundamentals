package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.Objects;
import java.util.Scanner;

public class EventController {
    public static void main(String[] args) {

        String BLACK_TEXT = "\u001B[30m";
        String WHITE_BACKGROUND = "\u001B[47m";
        String STANDARD_FORMAT = "\u001B[0m";

        boolean continueScheduling = true;

        System.out.println(
                "-----------------------------------------------------------------------------------"
        );

        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                        " -- Welcome to My Event Scheduler -- "
                        + STANDARD_FORMAT
        );

        System.out.println("-----------------------------------------------------------------------------------");


        while(continueScheduling) {
            System.out.println(
                    "Do you want to schedule something?"
                    + "\n'Y') Yes"
                    + "\n'N') No"
            );
            Scanner eventLoopScanner = new Scanner(System.in);
            String letsScheduleSomething = eventLoopScanner.next();


            if(letsScheduleSomething.equalsIgnoreCase("y")){
                continueScheduling = true;

                EventController controller = new EventController();

                System.out.println(
                        "Please input the event option:"
                        + "\n1) Social Event"
                        + "\n2) Work Event"
                );

                String eventOptionInput = controller.getEventOption();

                if (Objects.equals(eventOptionInput, "1")) {
                    SocialEvent userInputSocialEvent = new SocialEvent();
                    System.out.println("-----------------------------------------------------------------------------------");

                    System.out.println(
                            "Please input the name of the social event you want to schedule:"
                    );


                    String eventLoopInput = controller.getEventName();


                    userInputSocialEvent.describeEvent(eventLoopInput);
                    System.out.println("-----------------------------------------------------------------------------------");
                    userInputSocialEvent.setEventTime("January 10, 2022");
                    userInputSocialEvent.setImportanceLevel(5);
                    userInputSocialEvent.notifyIfAlreadyHappened(true);
                    System.out.println("-----------------------------------------------------------------------------------");
                } else {
                    WorkEvent userInputWorkEvent = new WorkEvent();
                    System.out.println("Please input the name of the work event you want to schedule:");


                    String eventLoopInput = controller.getEventName();

                    System.out.println("Work Event Input:");
                    userInputWorkEvent.describeEvent(eventLoopInput);
                    userInputWorkEvent.setEventTime("December 1, 2022");
                    userInputWorkEvent.setImportanceLevel(4);
                    userInputWorkEvent.notifyIfAlreadyHappened(false);
                    System.out.println("-----------------------------------------------------------------------------------");
                }

            } else {
                continueScheduling = false;
                System.out.println(
                        BLACK_TEXT + WHITE_BACKGROUND +
                                " -- Exiting Event Scheduler -- "
                                + STANDARD_FORMAT
                );
                break;
            }
        }


    }



    public String getEventName() {
        Scanner scanner = new Scanner(System.in);
        String eventNameName = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------");
        return eventNameName;
    }

    public String getEventOption() {
        Scanner eventOptionScanner = new Scanner(System.in);
        String eventNameName = eventOptionScanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("You entered this event option: " + eventNameName);
        return eventNameName;
    }
}
