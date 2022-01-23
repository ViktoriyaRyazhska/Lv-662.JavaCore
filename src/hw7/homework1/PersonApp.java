package hw7.homework1;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Student(new FullName("Oleg", "Kruts"), 18, 20);
        Person p2 = new Student(new FullName("Jack", "Raven"), 25, 65);

        System.out.println(p1.info() + ". " + p1.activity());
        System.out.println(p2.info() + ". " + p1.activity());

    }
}
