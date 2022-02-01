package hw5p1;

public class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    public boolean fly(){
        return false;
    }
    @Override
    public String toString() {
        return "Penguin " + super.toString();
    }
}
