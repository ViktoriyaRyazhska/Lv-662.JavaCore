package Task_5HM.Part1;

public abstract class Bird {

    //fields
    private boolean feathers;
    private boolean layEggs;


    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    //methods
    public boolean getFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public abstract boolean fly();

    @Override
    public  String toString(){
        return " feathers is " + feathers + " layEggs is " + layEggs;
    }
}

