package lesson_7.Homework;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdmember;
    int hourly_rate;

    public ContractEmployee(String federalTaxIdmember, int hourly_rate, String name, int hours, int employeeld) {
        super (employeeld, hours, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourly_rate = hourly_rate;
    }

    @Override
    public int calculatePay() {
        return hourly_rate*getHours();
    }

    @Override
    public String toString() {
        return "ContractEmployee: Id " + getEmployeeld() + ", Name " + getName() + ", "
                + ", fixed_monthly_payment=" + calculatePay();
    }


}
