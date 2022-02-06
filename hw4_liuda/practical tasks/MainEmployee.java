package prTask4p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainEmployee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Employee employee1 = new Employee("Petrenko", 1, 24500);
        Employee employee2 = new Employee("Ivanenko", 2, 16500);
        Employee employee3 = new Employee("Zinchenko", 3, 17000);
        Employee employee4 = new Employee("Fedenko", 4, 19500);
        Employee employee5 = new Employee("Bondarenko", 5, 22000);

        employee1.input(br);
        employee2.input(br);
        employee3.input(br);
        employee4.input(br);
        employee5.input(br);

        employee1.output();
        employee2.output();
        employee3.output();
        employee4.output();
        employee5.output();

        String[] arrayName = {employee1.getName(), employee2.getName(), employee3.getName(), employee4.getName(), employee5.getName()};


        int[] arraySalary = {employee1.getSalary(), employee2.getSalary(), employee3.getSalary(), employee4.getSalary(), employee5.getSalary()};

        int sorting;
        for (int i = 0; i < arraySalary.length - 1; i++ ) {
            for (int j = i + 1; j < arraySalary.length; j++) {
                if (arraySalary[i] < arraySalary[j]) {
                    sorting = arraySalary[i];
                    arraySalary[i] = arraySalary[j];
                    arraySalary[j] = sorting;
                }
            }
        }
        for (int i = 0; i < arraySalary.length; i++){
            System.out.println(arraySalary[i]);
        }
        // Task was "arrange workers by the field salary in descending order". But I couldn't find method to display two fields: names of employees and salary in descending order. There is only field in console with salary in such order.

        }
    }









