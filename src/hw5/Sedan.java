package hw5;

//Develop classes Truck and Sedan which extend class Car.
public class Sedan extends Car {

    public Sedan(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public int stop() {
        return 0;
    }
}
