package lesson_7.UML;

public class Boat extends WaterVehicle {

    private int volume;

    public Boat(int passengers) {
        super(passengers);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {

    }
}
