package Payment;

public class ContractEmployee extends Employee {

	private String federalTaxIdmember;
	private int fixedMonthlyPayment;
	
	
	public ContractEmployee(String employeeId, String name, int salary) {
		super(employeeId, name, salary);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public String toString() {
		return "ContractEmployee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
