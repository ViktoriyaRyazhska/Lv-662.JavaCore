package hw6p1;


public class ContractEmployee extends Employee implements Payment{
    private int hourlyRate = 100;
    private int numberOfHours = 40*7;
    int salaryHour;
    int getSalaryHour = hourlyRate * numberOfHours;



    String federalTaxIdmember;


    public ContractEmployee(String employeeld, String name, int salaryHour, String federalTaxIdmember) {
        super(employeeld, name);
        this.salaryHour = salaryHour;
        this.federalTaxIdmember = federalTaxIdmember;
    }



    @Override
    public int calculatePay() {
        return getSalaryHour;
    }


}
