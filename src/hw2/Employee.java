package hw2;

public class Employee {
	
	private static int totalSum = 0;
	
	private String name;
	private int rate;
	private int hours;
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public Employee() {

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getSalary() {
		totalSum += rate * hours;
		return rate * hours;
	}
	
	public void changeRate(int rate) {
		totalSum -= this.rate;
		this.rate = rate;
		totalSum += rate;
	}
	
	public double getBonuses() {
		return rate * hours * 0.1;
	}
	
	public static int getTotalSum() {
		return totalSum;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
}

