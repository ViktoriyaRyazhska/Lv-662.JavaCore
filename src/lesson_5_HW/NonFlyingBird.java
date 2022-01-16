package lesson_5_HW;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "non flying bird";
    }
}

