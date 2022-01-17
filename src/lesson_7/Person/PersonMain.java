package lesson_7.Person;

public class PersonMain {

    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Student("Diaz");
        person[1] = new Cleaner("Anna-Maria", 24, 30);
        person[2] = new Teacher("Roza", 40, 30);


        for (int i = 0; i < person.length; i++) {
            person[i].print();
            if (person[i] instanceof Staff) {
                System.out.println(((Staff) person[i]).Salary());
            }
        }


    }
}
