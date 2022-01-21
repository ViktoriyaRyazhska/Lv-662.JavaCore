package hw6.homework2;

public abstract class GroundedVehicle extends Passengers implements Vehicle {
    public GroundedVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
