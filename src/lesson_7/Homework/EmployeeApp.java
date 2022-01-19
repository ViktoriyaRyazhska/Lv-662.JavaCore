package lesson_7.Homework;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("FId134", 20, "Rosa", 40, 4567);
        employees[1] = new ContractEmployee("F409", 30, "Bianka", 36, 190);
        employees[2] = new SalariedEmployee("TO15788", 3400, 4113, 44, "Philip");
        employees[3] = new SalariedEmployee("TO78011", 2100, 1287, 46, "Glen");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
          System.out.println("My pay is " + employees[i].calculatePay());
        }

        Arrays.sort(employees);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }


    }

}
