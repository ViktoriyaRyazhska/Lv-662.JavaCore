package HW5;

public class Swallow extends FlyingBird{

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return " Swallow max speed is - " + maxSpeed +  "";
    }

}
