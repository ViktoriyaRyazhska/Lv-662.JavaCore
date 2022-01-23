package java23;

public class Main {
	 public static void main(String[] args) {
	Person arr[] = new Person[3];
    arr[0] = new Cleaner("Влад");
    arr[1] = new Teacheer("Дима");
    arr[2] = new Student("Александр");

    for (Person person : arr) {
        person.print();
        if(person instanceof Staff){
            ((Staff) person).salary();
        }
    }
}
}
