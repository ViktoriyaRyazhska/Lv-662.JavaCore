package prTask_6_p2;

public class Student extends Person{
    static final String TYPE_PERSON = "student";

    public Student(String name){
        super(name);

    }
    @Override
    public String print(){
        return "I am a " + TYPE_PERSON + " and I don't have salary";
    }
}
