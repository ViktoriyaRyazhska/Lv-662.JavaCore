package lesson_7.Person;

import org.w3c.dom.ls.LSOutput;

public class Teacher extends Staff{

    final static String Type_Person = "Teacher";

    public Teacher(String name, int hours, int rate) {
        super(name, hours, rate);
    }

    @Override
    public void print() {
        System.out.println("I am " + Type_Person + ", my name is " + getName());
    }
    @Override
    public int Salary() {
        return hours*rate;

    }
}
