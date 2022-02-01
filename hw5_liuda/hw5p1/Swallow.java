package hw5p1;

public class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public boolean fly() {
        return true;
    }

    @Override
    public String toString() {
        return "Swallow " + super.toString();
    }
}
