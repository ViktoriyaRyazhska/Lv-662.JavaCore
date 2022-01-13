package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Employee[] emp = new Employee[5];

        emp[0] = new Employee("Olga Shevchenko", 1, 100);
        emp[1] = new Employee("Andiy Mykyta", 2, 500);
        emp[2] = new Employee("Bogdan Melynuk", 3, 200);
        emp[3] = new Employee("Viktor Andienko", 3, 300);
        emp[4] = new Employee("Maria Kondratyuk", 2, 300);

        // Show employees from certain department
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartment_number() == a) {
                System.out.print("\nEmployees from this department are: " + emp[i].getName());
            }
        }
        //arrange workers by the field salary in descending order
        Employee tmp;
        for (int i = 0; i < emp.length; i++) {
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].getSalary() < emp[j].getSalary()) {
                    tmp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = tmp;
                }
            }
        }

        System.out.println("\n\nWorkers salary in descending order: ");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());
        }

    }
}
