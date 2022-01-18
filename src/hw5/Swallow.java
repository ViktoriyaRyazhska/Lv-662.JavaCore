package hw2.hw5;

public class Swallow extends FlyingBird {
    @Override
    public String toString() {
        return "Swallow " + super.toString();
    }

    public Swallow(String feather, int layEggs) {
        super(feather, layEggs);
    }
}
