package hw6;

public class Student extends Person {
    static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "My name is " + getName() + " and I am a " + TYPE_PERSON;
    }
}
