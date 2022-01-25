package l7HWQ1;

public class SalariedEmployee extends Employee implements Payment {
	private int hourlyPay;
	private int hoursWorked;
	private String socialSecurityNumber;

	SalariedEmployee() {
	}

	SalariedEmployee (String eID, String eName,int eHours, int ePay, String eSSN) {
		this.employeeid = eID;
		this.Name = eName;
		setHours(eHours);
		setPay(ePay);
		setSSN(eSSN);
		
	}

	public void setPay(int pay) {
		this.hourlyPay = pay;
	}

	public int getPay() {
		return this.hourlyPay;
	}

	public void setHours(int h) {
		this.hoursWorked = h;
	}

	public int getHours() {
		return this.hoursWorked;
	}

	public void setSSN(String ssn) {
		this.socialSecurityNumber = ssn;
	}

	public String getSSN() {
		return this.socialSecurityNumber;
	}

	@Override
	public int calculatePay() {
		return getPay() * getHours();
	}

}
