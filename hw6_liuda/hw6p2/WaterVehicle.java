package hw6p2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle(int passengers){
        super(passengers);
    }
    public abstract void isSailing();

}
