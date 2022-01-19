package lesson_7.Person;

public class PersonMain {

    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Student("Diaz");
        person[1] = new Cleaner("Anna-Maria", 24, 30);
        person[2] = new Teacher("Roza", 40, 30);


        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Staff) {
                person[i].print();
                System.out.println("My salary is " + ((Staff) person[i]).Salary());

            } else {
                person[i].print();
            }
        }



    }
}
