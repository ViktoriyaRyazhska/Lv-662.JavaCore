package hw6.homework;

public abstract class Employee implements Payment, Comparable<Employee> {
	
	protected String name;
	protected String employeeID;
	
	protected Employee(String name, String employeeID) {
		this.name = name;
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	@Override
	public int compareTo(Employee employee) {
		return this.calculatePay() - employee.calculatePay();
	} 	
		
	@Override
	public String toString() {
	  return "Employee [employeeID=" + employeeID + ", name=" + name + ", monthly wage=" +
				calculatePay() + "]";
	}
	
}
