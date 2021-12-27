package com.company;

public class Employee {
    private String name;
    private int rate;
    private double hours;

    public static int totalSum = 0;

    public Employee(){}

    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, double hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += this.rate * this.hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum -= this.rate * this.hours;
        this.rate = rate;
        totalSum += this.rate * this.hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -= this.rate * this.hours;
        this.hours = hours;
        totalSum += this.rate * this.hours;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    public void changeRate(int rate){
        totalSum -= this.rate * this.hours;
        this.rate = rate;
        totalSum += this.rate * this.hours;
    }

    public double getBonuses(){
        return this.rate * this.hours * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", rate=" + rate + ", hours=" + hours + '}';
    }
    public static int getTotalSum(){
        return totalSum;
    }
}
