package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class ShippingInputException extends IndexOutOfBoundsException{

    @Override
    public String toString() {
        return "There is no product corresponding to that number!";
    }
}
