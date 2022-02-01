package hw5p1;

public class Chicken extends NonFlyingBird{
    public Chicken(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    public boolean fly(){
        return false;
    }
    @Override
    public String toString() {
        return "Chicken " + super.toString();
    }
}
