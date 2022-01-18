package hw6;

public abstract class Staff extends Person {
    private int rate;
    private int hours;

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public Staff(String name, int rate, int hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    public abstract int salary();

}
