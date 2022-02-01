package hw5p1;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird (boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }


    public abstract boolean fly();

    @Override
    public String toString(){
        return " can fly - " + (fly()) + ",  can lay eggs - " + layEggs;

    }
}
