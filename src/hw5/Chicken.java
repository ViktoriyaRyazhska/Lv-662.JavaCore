package hw2.hw5;

public class Chicken extends NonFlyingBird {
    @Override
    public String toString() {
        return "Chicken " + super.toString();
    }

    public Chicken(String feather, int layEggs) {
        super(feather, layEggs);
    }
}
