package lesson_7.Homework;

import lesson_4_CW.Car;
import lesson_7.Person.Person;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("FId134", 20, "Rosa", 40, 4567);
        employees[1] = new ContractEmployee("F409", 30, "Bianka", 36, 190);
        employees[2] = new SalariedEmployee("TO15788", 3400, 4113, 44, "Philip");
        employees[3] = new SalariedEmployee("TO78011", 2100, 1287, 46, "Glen");


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
