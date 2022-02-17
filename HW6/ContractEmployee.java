package java24;

public class ContractEmployee extends Employee implements Payment{
	private String name;
    private String federalTaxldmember;
    private int workHours;
    private int hourRate = 450;


    public ContractEmployee(int workHours, String id,String name, String federalTaxldmember) {
        this.workHours = workHours;
        this.id = id;
        this.name = name;
        this.federalTaxldmember = federalTaxldmember;
    }

    @Override
    public int calculatePay () {
        return hourRate * workHours;
    }

    @Override
    public String toString(){
        return name + " ID:" + id + "  Федеральный налоговый номер : " + federalTaxldmember + "  Зарплата : "  + calculatePay();
    }
}
