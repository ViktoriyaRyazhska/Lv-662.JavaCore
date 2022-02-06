package prTask_6_p2;

public class Cleaner extends Staff{
    static final String TYPE_PERSON = "cleaner";

    public Cleaner(String name, int salary){
        super(name, salary);

    }

    @Override
    public String print(){
        return "I am a " + TYPE_PERSON;
    }
    int salary = 15000;

    @Override
    public int salary(){
        return salary;
    }

}
