package hw5p1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }

    public boolean fly(){
        return false;
    }

}
