package lesson_7.Homework;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;
    private int fixed_monthly_payment;

    public SalariedEmployee(String socialSecurityNumber, int fixed_monthly_payment,
                            int employeeld, int hours, String name) {
        super(employeeld, hours, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    @Override
    public int calculatePay() {
        return fixed_monthly_payment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fixed_monthly_payment=" + fixed_monthly_payment + super.toString();
    }
}
