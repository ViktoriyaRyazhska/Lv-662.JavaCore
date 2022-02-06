package prTask_6_p2;



public class Teacher extends Staff{

   static final String TYPE_PERSON = "teacher";

    public Teacher(String name, int salary){
        super(name, salary);
    }
    @Override
    public String print(){
        return "I am a " + TYPE_PERSON;
    }

    int salary = 25000;

    @Override
    public int salary(){
        return salary;
    }
}
