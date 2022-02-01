package hw5p1;

public class Eagle extends FlyingBird{
    public Eagle(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }
    public boolean fly(){
        return true;
    }
    @Override
    public String toString(){
        return "Eagle " + super.toString();
    }
}
