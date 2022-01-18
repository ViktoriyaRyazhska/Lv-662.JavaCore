package hw2.hw5;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feather, int layEggs) {
        super(feather, layEggs);
    }

    @Override
    public boolean fly() {
        return false;
    }
}
