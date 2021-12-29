package lesson_2;

public class Employee {

	private String name;
	private int rait;
	private int hours;
	private static int totalSum = 0;
	
	public Employee(String name, int rait, int hours) {
		this.name = name;
		this.rait = rait;
		this.hours = hours;
	}

	public Employee(String name, int rait) {
		this.name = name;
		this.rait = rait;
	}

	public Employee() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRait() {
		return rait;
	}
	
	public void setRait(int rait) {
		this.rait = rait;
		
	}
	
	public int getHours() {
		return rait;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getSalary() {
		totalSum += rait * hours;
		return rait * hours;
		
	}
	
	public static int getTotalSum() {
		return totalSum;
	}
	
	public double getBonuses() {
		return getSalary() * 0.1;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rait=" + rait + ", hours=" + hours + "]";
	}

	public void changeRate(int rait) {
		totalSum -= this.rait;
		this.rait = rait;
		totalSum += rait;
	}
	
	
	
	
	
}

