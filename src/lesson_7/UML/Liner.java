package lesson_7.UML;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner(int passengers) {
        super(passengers);
    }

    @Override
    public void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
