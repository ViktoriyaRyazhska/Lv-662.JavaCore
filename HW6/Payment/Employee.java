package Payment;

public abstract class Employee  implements Payment {
	
	public String employeeId;
	public String name;
	public int salary;
	
	public Employee(String employeeId, String name, int salary) {
		this.employeeId =  employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int calculatePay() {
		return salary;
		
	}

}
