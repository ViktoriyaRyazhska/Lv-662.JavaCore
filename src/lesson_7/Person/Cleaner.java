package lesson_7.Person;

public class Cleaner extends Staff{


    final static String Type_Person = "Cleaner";

    public Cleaner(String name, int hours, int rate) {
        super(name, hours, rate);
    }

    @Override
    public void print() {
        System.out.println("I am " + Type_Person);
    }

    @Override
    public int Salary() {
        return hours*rate;
    }

}
