package lesson_7.Homework;

import lesson_4_CW.Car;
import lesson_7.Person.Person;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee(45900, "Rosa", "SN1287", 40, 40);
        employees[1] = new ContractEmployee(45900, "Bianka", "SN0087", 50, 20);
        employees[2] = new SalariedEmployee(78014, "Philip", "TO1287", 5090);
        employees[3] = new SalariedEmployee(78011, "Glen", "TO1287", 4500);

// Descending sorting
//        Employee temp;
//        for (int i = 0; i < employees.length; i++) {
//            for (int j = i + 1; j < employees.length; j++) {
//                if (employees[i].calculatePay() < employees[j].calculatePay()) {
//                    temp = employees[i];
//                    employees[i] = employees[j];
//                    employees[j] = temp;
//                }
//            }
//        }
             Arrays.sort(employees);


        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }


    }

}
