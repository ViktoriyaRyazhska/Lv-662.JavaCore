package lesson_5_CW;

public class Truck extends Car{
    int speed;
    int hours;
    int petrol;

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
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
