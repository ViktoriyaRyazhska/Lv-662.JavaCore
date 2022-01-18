package Task_6Praktice.Task2;

public abstract class Person {

    //fields
    private String name;

    //constructor

    public Person(String name , String TYPE_PERSON) {
        this.name = name;
    }

    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String print();
}
