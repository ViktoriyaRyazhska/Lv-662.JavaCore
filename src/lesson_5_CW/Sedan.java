package lesson_5_CW;

public class Sedan extends Car {
    int speed;
    int hours;
    int petrol;

    public Sedan(String model, int maxSpeed, int yearOfManufacture, int hours, int petrol, int speed) {
        super(model, maxSpeed, yearOfManufacture);
        this.hours = hours;
        this.petrol = petrol;
        this.speed = speed;
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
