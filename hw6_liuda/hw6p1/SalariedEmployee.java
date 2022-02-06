package hw6p1;

public class SalariedEmployee extends Employee implements Payment{
    private int fixedPaid;
    private int salaryMonth;
    int getSalaryMonth = fixedPaid;


    String socialSecurityNumber;

     public SalariedEmployee(String employeeld, String name, int salaryMonth, String socialSecurityNumber) {
        super(employeeld, name);
        this.salaryMonth = salaryMonth;
        this.socialSecurityNumber = socialSecurityNumber;

    }


    @Override
    public int calculatePay() {
        return salaryMonth;
    }
}
