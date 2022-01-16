package lesson_5_HW;

public class FlyingBird extends Bird{

    @Override
    public String fly() {
        return "flying bird";
    }

    public FlyingBird(String feathers, int layEggs) {
        super (feathers, layEggs);
    }
}
