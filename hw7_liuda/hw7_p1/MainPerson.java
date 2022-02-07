package hw7_p1;

public class MainPerson {
    public static void main(String[] args) {

        Person[] student = new Person[2];
        student[0] = new Student(new FullName("Ihor", "Ognenko"),19, 2);
        student[1] = new Student(new FullName("Uliana", "Demus"), 21, 4);

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].info());
            System.out.println(student[i].activity());

        }

    }
}
