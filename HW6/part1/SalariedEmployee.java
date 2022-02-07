package com.company;

public class SalariedEmployee extends Employee implements Payment{
    private int hourlyRate;
    private int numberOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(int employeeId, String name, int hourlyRate, int numberOfHoursWorked, String socialSecurityNumber) {
        super(employeeId, name);
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employee Id= " + getEmployeeId() +
                ", name= " + getName() +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", salary= " + calculatePay() +
                '}';
    }
}
