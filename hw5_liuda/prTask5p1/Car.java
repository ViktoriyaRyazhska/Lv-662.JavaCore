package prTask5p1;

public abstract class Car {
    private final String model;
    private final double maxSpeed;
    protected int yearOfManufacture;

    public abstract double run();
    public abstract double stop();

    public Car(String model, double maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }



    @Override
    public String toString() {
      return "Model " + model + ", " + "max speed " + maxSpeed + ", " + "year of manufacture " + yearOfManufacture;
    }


}
