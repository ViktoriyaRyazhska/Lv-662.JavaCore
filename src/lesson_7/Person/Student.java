package lesson_7.Person;

public class Student extends Person{

    final static String Type_Person = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am " + Type_Person + ", my name is " + getName());

    }
}
