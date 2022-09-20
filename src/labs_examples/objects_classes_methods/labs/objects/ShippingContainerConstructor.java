package labs_examples.objects_classes_methods.labs.objects;

public class ShippingContainerConstructor {
    public static void main(String[] args) {
        String BLACK_TEXT = "\u001B[30m";
        String WHITE_BACKGROUND = "\u001B[47m";
        String RESET_STANDARD =  "\u001B[0m";

        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(BLACK_TEXT + WHITE_BACKGROUND +
                "These are 3 objects of a Shipping Container class with different constructors"
                + RESET_STANDARD
        );
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("First by providing width, height, and depth:");
        System.out.println("------------------------------------------------------------------------------");
        ShippingContainer container1 = new ShippingContainer(10, 20, 15);
        System.out.println("Container 1 -- width: "  + container1.width + " height: " +
                container1.height + " depth: " + container1.depth);
        System.out.println(container1.toString());
        System.out.println("------------------------------------------------------------------------------");
        ShippingContainer container2 = new ShippingContainer();
        System.out.println("Second by providing no arguments and everything is assigned to zero:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Container 2 -- width: "  + container2.width + " height: " +
                container2.height + " depth: " + container2.depth);
        System.out.println(container2.toString());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Third by providing a length, and other variables are assigned that value:");
        System.out.println("------------------------------------------------------------------------------");
        ShippingContainer container3 = new ShippingContainer(7);
        System.out.println("Container 3 -- width: "  + container3.width + " height: " +
                container3.height + " depth: " + container3.depth);
        System.out.println(container3.toString());
        System.out.println("------------------------------------------------------------------------------");
    }
}
