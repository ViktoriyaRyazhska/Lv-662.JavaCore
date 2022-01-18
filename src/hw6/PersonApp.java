package hw6;

public class PersonApp {
    public static void main(String[] args) {
        Person [] person = new Person[3];

        person[0] = new Student("Mykola");
        person[1] = new Teacher("Ivanna", 250, 85);
        person[2] = new Cleaner("Vasyl", 350, 120);

        for ( Person i : person ) {
            if (i instanceof Staff) {
                System.out.println(i.print() + ". My salary: " + ((Staff) i).salary() + "\u20B4");
            } else {
                System.out.println(i.print());
            }
        }
    }
}
