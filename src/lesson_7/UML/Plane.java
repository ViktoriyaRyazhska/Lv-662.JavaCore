package lesson_7.UML;

public class Plane extends FlyingVehicle {
    private int maxDistance;


    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }


}
