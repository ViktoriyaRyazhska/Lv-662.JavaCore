package com.company;

public class ContractEmployee extends Employee implements Payment {

    private int fixedMonthlyPayment = 10000;
    private String federalTaxIdMember;

    public ContractEmployee(int employeeId, String name, String federalTaxIdMember) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employee Id= " + getEmployeeId() +
                ", name= " + getName() +
                ", fixed monthly payment=" + fixedMonthlyPayment +
                ", salary= " + calculatePay() +
                '}';
    }
}
