package hw6.homework;

public class SalariedEmployee extends Employee {

	private String socialSecurityNumber;
	private int monthlyPayment;
	
	public SalariedEmployee(String name, String employeeID, String socialSecurityNumber, 
							int monthlyPayment) {
		super(name, employeeID);
		this.socialSecurityNumber = socialSecurityNumber;
		this.monthlyPayment = monthlyPayment;
	}
	
	@Override
	public int calculatePay() {
		return monthlyPayment;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public int getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

}
