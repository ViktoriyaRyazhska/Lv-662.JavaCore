package lesson_7.Person;

public class Teacher extends Staff{

    final static String Type_Person = "Teacher";


    public Teacher(String name, int hours, int rate) {
        super (name, hours, rate);
        this.name = name;

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
