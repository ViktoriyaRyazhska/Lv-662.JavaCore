package hw6;

public class ContractEmployee extends Employee {

    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeld, String federalTaxIdmember, int fixedMonthlyPayment) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "Contract Employee: " + getEmployeeld() + ", Federal Tax ID="+ '\'' + federalTaxIdmember + '\'';
    }

}
