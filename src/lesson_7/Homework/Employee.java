package lesson_7.Homework;

import java.util.Comparator;

abstract public class Employee implements Payment, Comparable<Employee>{
    private int employeeld;
    private int hours;
    private String name;


    public Employee(int employeeld, int hours, String name) {
        this.employeeld = employeeld;
        this.hours = hours;
        this.name = name;
    }

    public int compareTo(Employee e) {
        return this.calculatePay() - e.calculatePay();
    }


    public int getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(int employeeld) {
        this.employeeld = employeeld;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld=" + employeeld +
                ", hours=" + hours +
                ", name='" + name + '\'' +
                '}';
    }

}
