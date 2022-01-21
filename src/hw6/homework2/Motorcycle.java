package hw6.homework2;

public class Motorcycle extends GroundedVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
