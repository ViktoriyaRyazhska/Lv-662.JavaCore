package TaskTwo;



public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Sergiy");
        e1.setRate(5);
        e1.setHours(8);


        Employee e2 = new Employee("Anton",4,6);

        Employee e3 = new Employee("Denis", 3);
        e3.setHours(10);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);



        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        System.out.println(e3.getSalary());

        System.out.println(e1.getBonuses() + " percent ");
        System.out.println(e2.getBonuses()+ " percent ");
        System.out.println(e3.getBonuses()+ " percent ");
    }
}
