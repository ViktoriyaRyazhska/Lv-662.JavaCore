package prTask_6_p2;

public class MainPerson {
    public static void main(String[] args) {

        Person[] person = new Person[3];
        person[0] = new Student("Petro");
        person[1] = new Teacher("Iryna", 25000);
        person[2] = new Cleaner("Maria", 15000);



        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Staff){
               System.out.println(person[i].print() + " and my salary is " + ((Staff) person[i]).getSalary());
            }
            else {
                System.out.println(person[i].print());
            }

        }
    }
}
