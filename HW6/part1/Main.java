package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new SalariedEmployee(1,"Sasha",60, 42, "02134212"),
                new SalariedEmployee(2,"Kolya",60, 35, "03627185"),
                new ContractEmployee(3,"Julia","931234321"),
                new ContractEmployee(4,"Rostislav","912456712")
        };

        Employee tmp;

        Arrays.sort(employees);

        for( int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString());
            }

    }
}
/*1. Create Payment interface with the method calculatePay(), the base class
Employee with a string variable employeeld.
Create two classes SalariedEmployee and ContractEmployee, which
implement interface and are inherited from the base class.
• Describe hourly paid workers in the relevant classes (one of the children),
and fixed paid workers (second child).
• Describe the string variable socialSecurityNumber in the class
SalariedEmployee .
• Include a description of federalTaxIdmember in the class of
ContractEmployee.
43.
SoftServe Confidential
Homework
• The calculation formula for the "time-worker“ is: the average monthly
salary = hourly rate * number of hours worked
• For employees with a fixed payment the formula is: the average monthly
salary = fixed monthly payment
• Create an array of employees and add the employees with different form of
payment.
• Arrange the entire sequence of workers descending the average monthly
wage. Output the employee ID, name, and the average monthly wage for all
elements of the list.
 */