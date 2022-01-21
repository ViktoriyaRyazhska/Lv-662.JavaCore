package lesson_7.UML;

abstract public class GroundVehicle extends Passengers implements Vehicle {


    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
