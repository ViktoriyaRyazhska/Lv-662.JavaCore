package HW5;

public class Penguin extends NonFlyingBird{
    @Override
    public void setBeak(String beak) {
         this.beak = beak;
    }
    @Override
    public String toString() {
        return " Penguin beak is - " + beak +  "";
    }

}
