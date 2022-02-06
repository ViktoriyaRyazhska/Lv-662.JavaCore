package prTask4p2;

import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
    private final String name;
    private int departmentNumber;
    private final int salary;


    public Employee(String name,int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartmentNumber() {
        return this.departmentNumber;
    }

    public int getSalary() {
        return this.salary;
    }




    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Department Number 1, 2, 3, 4, 5");
        this.departmentNumber = Integer.parseInt(br.readLine());


    }

    public void output() {
        System.out.println("Emploee " + name + " Department Number " + departmentNumber);
    }
}

