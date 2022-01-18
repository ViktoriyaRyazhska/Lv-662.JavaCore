package hw2.hw5;

public class FlyingBird extends Bird {
    public FlyingBird(String feather, int layEggs) {
        super(feather, layEggs);
    }

    @Override
    public boolean fly() {
        return true;
    }
}
