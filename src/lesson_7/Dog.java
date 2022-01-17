package lesson_7;

public class Dog implements Animal {

    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Gaf");
    }

    @Override
    public void feed() {
        System.out.println("Meet");
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
