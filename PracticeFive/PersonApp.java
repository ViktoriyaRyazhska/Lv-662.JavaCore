package PracticeFive;

public class PersonApp {
    public static void main(String[] args) {
        Person arr[] = new Person[3];
        arr[0] = new Cleaner("Max");
        arr[1] = new Teacher("Anton");
        arr[2] = new Student("Sergiy");

        for (Person person : arr) {
            person.print();
            if(person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}
