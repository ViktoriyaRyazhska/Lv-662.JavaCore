package Task_6Praktice.Task2;

public abstract class Staff extends Person {

    //constructor
    public Staff(String name, String TYPE_PERSON) {
        super(name , TYPE_PERSON);
    }


    //methods
    @Override
    public String print() {
        return "I am a Staff";
    }
    public abstract int salary();
}
