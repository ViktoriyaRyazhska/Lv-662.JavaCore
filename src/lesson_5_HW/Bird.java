package lesson_5_HW;

abstract public class Bird {

    //attributes feathers and layEggs

    private String feathers;
    private int layEggs;

    public Bird(String feathers, int layEggs) {
    }

    public abstract String fly(); // abstarct method fly()

    //getters and setters for feathers and layEggs

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    //method to print info about this class

    public void print () {
        System.out.println("Bird class");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}

