package hw5p2;

import java.util.Arrays;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Sofia", 32, 17500.50);
        employees[1] = new Employee("Oleh", 39, 23000.00);
        employees[2] = new Developer("Maria", 29, 14000.20, "Java Developer");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].report());

        }


    }
}
