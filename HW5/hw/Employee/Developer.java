package Employee;

public class Developer extends Employee{
	
	protected String position;

	public Developer(String name, int age, String position, double salary) {
		super(name, age, salary);	
	}
	
	
	
	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public String report() {
		return String.format("Name: %s, Age: %d, Position: %s Salary: \u20B4 %.2f", name, age, position, salary);
		
	}

}
