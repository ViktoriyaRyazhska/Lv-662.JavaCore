package Payment;

public class SalariedEmployee extends Employee {

	private String socialSecurityNumber;
	private int hours;
	private int rate;
	private int salary = hours * rate;
	
	public SalariedEmployee(String employeeId, String name, int salary) {
		super(employeeId, name, salary);
		this.hours = hours;
		this.rate = rate;
		this.salary = hours * rate;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
