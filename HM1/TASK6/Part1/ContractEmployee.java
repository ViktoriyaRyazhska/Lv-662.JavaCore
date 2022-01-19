package Task_6HM.Part1;

public class ContractEmployee extends Employee implements Payment{


    //fields
    private final int fixedMonthlyPayment = 1300;
    private String federalTaxIdMember = " federal tax = 20% of payment";
    private String name;
    public int salary;

    //constructor


    public ContractEmployee(String employeeld, String name) {
        super(employeeld,name);
        this.name = name;

    }

    //method
    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public String toString(){
        return "Name " + name + " Salary " + calculatePay();
    }
}

