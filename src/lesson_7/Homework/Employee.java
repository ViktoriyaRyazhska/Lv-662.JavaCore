package lesson_7.Homework;

import java.util.Comparator;

abstract public class Employee implements Payment, Comparable<Employee>{
    private int employeeld;
    private String name;


    public Employee(int employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }

    public int compareTo(Employee e) {
        return e.calculatePay() - this.calculatePay();
    }


    public int getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(int employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld=" + employeeld +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
