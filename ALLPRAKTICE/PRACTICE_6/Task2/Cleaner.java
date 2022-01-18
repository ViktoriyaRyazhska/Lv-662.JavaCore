package Task_6Praktice.Task2;

public class Cleaner extends Staff {

    //fields
    final String TYPE_PERSON = "Neuroticism";

    //constructor
    public Cleaner(String name,String TYPE_PERSON) {
        super(name , TYPE_PERSON);
    }

    //methods
    @Override
    public String print() {
        return "I am a Cleaner";
    }

    @Override
    public int salary() {
        return 12000;
    }
}