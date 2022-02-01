package prTask5p1;

public class Truck extends Car {

    public Truck(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public double run() {
        return 0;
    }

    @Override
    public double stop() {
        return 0;
    }

}
