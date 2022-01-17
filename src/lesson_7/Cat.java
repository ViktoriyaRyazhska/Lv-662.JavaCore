package lesson_7;

public class Cat implements Animal {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Miu");
    }

    @Override
    public void feed() {
        System.out.println("Fish");
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
