package lesson_5_HW;

public class Eagle extends FlyingBird {


    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle: " + super.toString();
    }
}
