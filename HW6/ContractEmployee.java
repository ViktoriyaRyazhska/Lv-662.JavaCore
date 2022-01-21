package HW6;

public class ContractEmployee extends Employee implements Payment{

    private String name;
    private String federalTaxldmember;
    private int workHours;
    private int hourRate = 100;


    public ContractEmployee(int workHours, String employeeid,String name, String federalTaxldmember) {
        this.workHours = workHours;
        this.employeeid = employeeid;
        this.name = name;
        this.federalTaxldmember = federalTaxldmember;
    }

    @Override
    public int calculatePay() {
        return hourRate *this.workHours;
    }

    @Override
    public String toString(){
        return "Employee name: " + name + " ID:" + employeeid + "  Federal Tax number : " + federalTaxldmember + "  Salary : "  + calculatePay();
    }
}
