package hw2.hw5;

public class Eagle extends FlyingBird {
    @Override
    public String toString() {
        return "Eagle " + super.toString();
    }

    public Eagle(String feather, int layEggs) {
        super(feather, layEggs);
    }
}
