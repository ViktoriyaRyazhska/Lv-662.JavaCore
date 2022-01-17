package lesson_5_HW;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Santino", 32, 3000);
        employee[1] = new Employee("Lucia", 25, 1600);
        employee[2] = new Employee("Karl", 29, 2500);
        employee[3] = new Developer("Michael", 30, 3100, "Lead Java Software Engineer");
        employee[4] = new Developer("Mark", 27, 400, "Trainee QC Engineer");


        for (int i = 0; i < employee.length; i++){
            System.out.println(employee[i].report());
        }
    }
}
