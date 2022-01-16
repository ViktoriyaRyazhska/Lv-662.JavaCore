package lesson_4_CW;

import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
    private String name;
    private int salary;
    private int department_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public Employee() {
    }

    public Employee(String name, int salary, int department_number) {
        this.name = name;
        this.salary = salary;
        this.department_number = department_number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department_number=" + department_number +
                '}';
    }
}

