package Task_5Praktice.Car;

public class Sedan extends task5_1_abstractClass {

    public Sedan(String model, int maxSpeed, int yearOfManufacture_properties) {
        super(model, maxSpeed, yearOfManufacture_properties);
    }

    @Override
    public int run(){
        return  getMaxSpeed();
    }
    @Override
    public  int stop(){
        return getMaxSpeed() - getMaxSpeed();
    }
}
