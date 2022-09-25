package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class SportingBoard {
    private double length;
    private double width;
    private double thickness;

    String brandName;
    String modelName;
    int yearReleased;

    public SportingBoard() {
        length = 200;
        width = 100;
        thickness = 5;
        brandName = "Generic Brand";
        modelName = "Generic Model";
        yearReleased = 2000;
    }

    @Override
    public String toString() {
        return "SportingBoard{" +
                "length=" + length +
                ", width=" + width +
                ", thickness=" + thickness +
                '}';
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getThickness() {
        return thickness;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public SportingBoard(double length, double width, double thickness,
                         String brandName, String modelName, int yearReleased) {
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.brandName = brandName;
        this.modelName = modelName;
        this.yearReleased = yearReleased;
    }
}
