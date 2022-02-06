package prTask_6_p2;

public abstract class Person {

    private String name;


    public abstract String print();

    public String getName(){
        return name;
    }

    public Person (String name){
        this.name = name;
    }
}
