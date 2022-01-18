package Task_6Praktice.Task2;

public class Student extends Person{

    //fields
    final String TYPE_PERSON = "Experience";

    //constructor
    public Student(String name , String TYPE_PERSON) {
        super(name,TYPE_PERSON);
    }

    //method
    @Override
    public String print() {
        return "I am a Student";
    }
}
