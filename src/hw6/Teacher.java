package hw6;

public class Teacher extends Staff {
    static final String TYPE_PERSON = "Teacher";

    public Teacher(String name, int rate, int hours) {
        super(name, rate, hours);
    }

    @Override
    public int salary() {
        return getRate() * getHours();
    }

    @Override
    public String print() {
        return "My name is " + getName() + " and I am a " + TYPE_PERSON;
    }

}
