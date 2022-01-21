package hw6.homework2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
