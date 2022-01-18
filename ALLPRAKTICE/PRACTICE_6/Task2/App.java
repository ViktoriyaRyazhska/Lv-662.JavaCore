package Task_6Praktice.Task2;

public class App {
    public static void main(String[] args) {

        Person[] people = new Person[6];
        people[0] = new Teacher("Taras", "Extrovert");
        people[1] = new Teacher("Kate", "Extrovert");
        people[2] = new Cleaner("Sally", "Extrovert");
        people[3] = new Cleaner("Ted", "Extrovert");
        people[4] = new Student("Eshly", "Extrovert");
        people[5] = new Student("Victor", "Extrovert");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].print());

        }
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Teacher) {
                System.out.println(((Teacher) people[i]).salary());
            } else if (people[i] instanceof Cleaner) {
                System.out.println(((Cleaner) people[i]).salary());
            } else {
                continue;
            }
        }
    }
}
