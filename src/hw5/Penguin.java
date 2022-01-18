package hw2.hw5;

public class Penguin extends NonFlyingBird {
    @Override
    public String toString() {
        return "Penguin " + super.toString();
    }

    public Penguin(String feather, int layEggs) {
        super(feather, layEggs);
    }
}
