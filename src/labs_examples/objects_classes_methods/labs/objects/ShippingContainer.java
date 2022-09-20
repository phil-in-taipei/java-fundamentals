package labs_examples.objects_classes_methods.labs.objects;

public class ShippingContainer {
    double width;
    double height;
    double depth;

    ShippingContainer(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    ShippingContainer() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    ShippingContainer(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    @Override
    public String toString() {
        return "ShippingContainer{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
