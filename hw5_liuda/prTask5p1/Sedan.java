package prTask5p1;

public class Sedan extends Car {

    public Sedan(String model, double maxSpeed, int yearOfManufacture) {
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
