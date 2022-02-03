package HW3;

public class Dog {
    String name;
    Breed breed;
    int age;
    public enum Breed{
        Labrador, Bulldog,Chau_chau}

    public Dog(String name, Breed type, int age) {
        this.name = name;
        this.breed = type;
        this.age = age;
    }
}

