package lesson_5_CW;

public class Sedan extends Car {
    int speed;
    int hours;
    int petrol;

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public double run() {
        return speed*hours;
    }

    @Override
    public double stop() {
        return hours*petrol;
    }
}
