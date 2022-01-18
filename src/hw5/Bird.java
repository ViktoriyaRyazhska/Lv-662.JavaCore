package hw2.hw5;

public abstract class Bird {
    private String feather;
    private int layEggs;

    public Bird(String feather, int layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "[" +
                "feather:" + feather +
                ", layEggs:" + layEggs +
                ']';
    }

    public abstract boolean fly();
}
