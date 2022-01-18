package Task_6Praktice.Task2;

public class Teacher extends Staff{

    //fields
    final String TYPE_PERSON = "Extroversion";

    //constructor
    public Teacher(String name, String TYPE_PERSON) {
        super(name, TYPE_PERSON);
    }

    //methods
    @Override
    public String print() {
        return "I am a Teacher";
    }

    @Override
    public int salary() {
        return 20000;
    }
}
