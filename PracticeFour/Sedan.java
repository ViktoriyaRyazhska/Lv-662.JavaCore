package PracticeFour;

public class Sedan extends Car{


    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void setModel(String model) {
     this.model = model;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
    }

    @Override
    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }

    @Override
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    @Override
    public String toString() {
        return "Info [model=" + model + ", MaxSpeed =" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture +"]";
        }
}
