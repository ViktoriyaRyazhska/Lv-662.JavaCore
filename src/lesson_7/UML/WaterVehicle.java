package lesson_7.UML;

abstract public class WaterVehicle extends Passengers implements Vehicle  {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}