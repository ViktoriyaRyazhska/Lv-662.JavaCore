package lesson_8.HomeWork1;

public class MainAppl {
    public static void main(String[] args) {
        Person [] people = new Person[2];
        people[0] = new Student(new FullName("Anna", "Mariia"), 25, 5);
        people[1] = new Student(new FullName("Roza", "Diaz"), 24, 4);


        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].info());
            System.out.println(people[i].activity());
        }

    }
}
