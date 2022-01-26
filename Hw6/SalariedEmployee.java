package java24;

public class SalariedEmployee extends Employee implements Payment{
	private String socialSecurityNumber;
    private String name;
    private int  fixedmonthpayment;

    public SalariedEmployee(String socialSecurityNumber, String name,String id,int fixedmonthpayment) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.id = id;
        this.fixedmonthpayment = fixedmonthpayment;
    }

    @Override
    public int calculatePay() {
        return fixedmonthpayment;
    }

    @Override
    public String toString(){
        return  name + " ID:" + id + "  Номер социального страхования : " + socialSecurityNumber + "  Зарплата: "  + calculatePay();
    }
}
