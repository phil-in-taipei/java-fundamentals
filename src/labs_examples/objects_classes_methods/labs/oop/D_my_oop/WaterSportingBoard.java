package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class WaterSportingBoard extends SportingBoard {
    String bodyOfWaterUseType;

    WaterSportingBoard() {
        super();
        bodyOfWaterUseType = "open water";
    }

    @Override
    public String toString() {
        return "WaterSportingBoard{" +
                "\n bodyOfWaterUseType='" + bodyOfWaterUseType + '\'' +
                ", \n brandName='" + brandName + '\'' +
                ", \n modelName='" + modelName + '\'' +
                ", \n yearReleased=" + yearReleased + "\n " +
                '}';
    }

    public void setBodyOfWaterUseType(String bodyOfWaterUseType) {
        this.bodyOfWaterUseType = bodyOfWaterUseType;
    }

    public String getBodyOfWaterUseType() {
        return bodyOfWaterUseType;
    }

    public WaterSportingBoard(double length, double width,
                              double thickness, String brandName,
                              String modelName, int yearReleased,
                              String bodyOfWaterUseType) {
        super(length, width, thickness, brandName, modelName, yearReleased);
        this.bodyOfWaterUseType = bodyOfWaterUseType;
    }
}
