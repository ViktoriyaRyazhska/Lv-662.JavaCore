package com.company;

public class Developer extends Employee {

    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return "Employee{" + "name='" + getName() + '\'' + ", age=" + getAge() + ", Position=" + position + ", salary=" + getSalary() + '}';
    }
}
