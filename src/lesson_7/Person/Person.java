package lesson_7.Person;

abstract public class Person {
    private String name;

    public abstract void print();

    public Person(String name) {
        this.name = name;
    }
}
