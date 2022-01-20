package hw6.homework;

public class ContractEmployee extends Employee {
	
	private String federalTaxIdNumber;
	private int hourlyRate;
	private int hoursWorked;
	
	public ContractEmployee(String name, String employeeID, String federalTaxIdNumber, 
			int hourlyRate, int hoursWorked) {
		super(name, employeeID);
		this.federalTaxIdNumber = federalTaxIdNumber;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public String getFederalTaxIdNumber() {
		return federalTaxIdNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setFederalTaxIdNumber(String federalTaxIdNumber) {
		this.federalTaxIdNumber = federalTaxIdNumber;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int calculatePay() {
		return hourlyRate * hoursWorked;
	}
	
}
