package hw6;

public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;
    private int rate;
    private int hours;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, int rate, int hours) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public int calculatePay() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Salaried Employee: " + getEmployeeld() + ", Social Security Number="+ '\'' + socialSecurityNumber + '\'';
    }

}
