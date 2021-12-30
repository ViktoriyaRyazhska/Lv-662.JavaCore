package Task_2Practice;

public class Application {
    public static void main(String[] args) {

        Employee person1 = new Employee();
            person1.setName("Sasha") ;
            person1.setHours(10);
            person1.setRate(40);

        Employee person2 = new Employee("Ivan",15);
            person2.setHours(8);

        Employee person3 = new Employee("Roman" , 8 ,15);


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person1.getSalary());
        System.out.println(person2.getSalary());
        System.out.println(person3.getSalary());

        System.out.println(person1.getSalary()+person2.getSalary()+person3.getSalary());

        System.out.println(person1.getBonuses() + " bonus");
        System.out.println(person2.getBonuses() + " bonus");
        System.out.println(person3.getBonuses() + " bonus");

     }
}

