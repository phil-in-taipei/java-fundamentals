package labs_examples.enumerations.labs;

public class ClassStatusController {
    public static void main(String[] args) {
        ClassStatus firstDay = new ClassStatus(ClassStatusOptions.SCHEDULED);
        System.out.println(firstDay.getStatus());
    }
}
