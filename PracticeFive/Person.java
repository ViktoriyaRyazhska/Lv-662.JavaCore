package PracticeFive;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void print();
}