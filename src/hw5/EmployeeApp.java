package hw2.hw5;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] emp = new Employee[2];

        emp[0] = new Employee("Taras", 25, 1500);
        emp[1] = new Developer("Olga", 35, 4600, "Designer");

        for (Employee i: emp) {
            System.out.println(i.report());
        }
    }
}
