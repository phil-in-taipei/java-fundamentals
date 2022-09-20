package labs_examples.objects_classes_methods.labs.objects;

public class MachineSerialNumberAssociation {
    public static void main(String[] args) {
        Machine machine = new Machine("Commodore 2001");
        SerialNumber serialNumber = new SerialNumber("9X2458ZY200");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Associated classes (Machine and Serial Number)");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(machine.machineName + " has this serial number: " + serialNumber.serialNumber);
        System.out.println("---------------------------------------------------------------------------");
    }
}
