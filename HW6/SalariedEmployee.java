package HW6;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;
    private String name;
    private int  fixedmonthpayment;

    public SalariedEmployee(String socialSecurityNumber, String name,String employeeid,int fixedmonthpayment) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.employeeid = employeeid;
        this.fixedmonthpayment = fixedmonthpayment;
    }

    @Override
    public int calculatePay() {
        return fixedmonthpayment;
    }

    @Override
    public String toString(){
        return "Employee name: " + name + " ID:" + employeeid + "  Social security number : " + socialSecurityNumber + "  Salary : "  + calculatePay();
    }
}

