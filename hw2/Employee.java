package hw2;

public class Employee {
	private static int totalSum = 0;
	
	private String name;
	private int rate;
	private int hours;
	
	public Employee() {}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += this.getSalary();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRate(int rate) {
		totalSum -= getSalary();
		this.rate = rate;
		totalSum += getSalary();
	}

	public void setHours(int hours) {
		totalSum -= getSalary();
		this.hours = hours;
		totalSum += getSalary();
	}

	public static int getTotalSum() {
		return totalSum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRate() {
		return rate;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getSalary() {
		return rate*hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public void changeRate(int rate)  {
		totalSum -= getSalary();
		this.rate = rate;
		totalSum += getSalary();
	}
	
	public double getBonuses() {
		return getSalary()/10;
	}

}
