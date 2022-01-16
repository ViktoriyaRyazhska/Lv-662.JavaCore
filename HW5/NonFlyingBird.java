package HW5;

public abstract class NonFlyingBird extends Bird{
    String beak;

    public void setBeak(String beak) {
        this.beak = beak;
    }

    public  void fly(){
        System.out.println("Cannot fly");
    }
}
