package lesson_7.Person;

abstract public class Staff extends Person {

    int hours;
    int rate;
    String name;

    public Staff(String name, int hours, int rate) {
        super (name);
        this.hours = hours;
        this.rate = rate;
    }

    public abstract int Salary();

}
