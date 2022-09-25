package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


public class LandSportingBoard extends SportingBoard {

    String terrainType;


    public LandSportingBoard() {
        super();
        terrainType = "pavement";
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public String toString() {
        return "LandSportingBoard{" +
                "terrainType='" + terrainType + '\'' +
                '}';
    }

    public String getTerrainType() {
        return terrainType;
    }

    public LandSportingBoard(double length, double width,
                             double thickness, String terrainType,
                             String brandName, String modelName, int yearReleased) {
        super(length, width, thickness, brandName, modelName, yearReleased);
        this.terrainType = terrainType;
    }
}
