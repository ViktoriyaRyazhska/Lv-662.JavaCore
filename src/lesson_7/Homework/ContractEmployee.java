package lesson_7.Homework;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdmember;
    private int hourly_rate;
    private int hours;

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ContractEmployee(int employeeld, String name, String federalTaxIdmember, int hourly_rate, int hours) {
        super(employeeld, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourly_rate = hourly_rate;
        this.hours = hours;
    }


    @Override
    public int calculatePay() {
        return getHourly_rate()*getHours();
    }

    @Override
    public String toString() {
        return "ContractEmployee: Id " + getEmployeeld() + ", Name " + getName() + ", "
                + ", fixed_monthly_payment=" + calculatePay();
    }




}
