package labs_examples.input_output.labs;

public class SportingBoard {

    String brandName;
    String modelName;
    int yearReleased;

    public SportingBoard() {
        brandName = "Generic Brand";
        modelName = "Generic Model";
        yearReleased = 2000;
    }

    @Override
    public String toString() {
        return "SportingBoard{" +
                "brandName=" + brandName +
                ", modelName=" + modelName +
                ", yearReleased=" + yearReleased +
                '}';
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

    public SportingBoard(
            String brandName, String modelName, int yearReleased
    ) {

        this.brandName = brandName;
        this.modelName = modelName;
        this.yearReleased = yearReleased;
    }
}
