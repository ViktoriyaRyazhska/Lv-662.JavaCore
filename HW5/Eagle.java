package HW5;

public class Eagle extends FlyingBird{

    @Override
    public String toString() {
        return " Eagle max speed is - " + maxSpeed +  "";
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
