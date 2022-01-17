package Task_5Praktice.Car;

public abstract class task5_1_abstractClass{

    //fields
    private String model;
    private int maxSpeed;
    private int yearOfManufacture_properties;

    //constructors

    public task5_1_abstractClass(String model, int maxSpeed, int yearOfManufacture_properties) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture_properties = yearOfManufacture_properties;
    }

    //methods

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture_properties() {
        return yearOfManufacture_properties;
    }

    public void setYearOfManufacture_properties(int yearOfManufacture_properties) {
        this.yearOfManufacture_properties = yearOfManufacture_properties;
    }

    public abstract   int run();
    public abstract int stop();

}


