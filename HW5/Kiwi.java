package HW5;

public class Kiwi extends NonFlyingBird{
    @Override
    public void setBeak(String beak) {
        this.beak = beak;
    }
    @Override
    public String toString() {
        return " Kiwi beak is - " + beak +  "";
    }

}
