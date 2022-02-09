package PracticalTasks_2;

public class Employee {
	private static float totalSum = 0;
	private static int count = 0;
	
	
	private String name;
	private int rate;
	private int hours;

	{
		count ++;
	}
	
	public Employee() {
		totalSum = this.rate * this.hours;
	}
	
	public Employee(String n, int r) {
		this.name = n;
		this.rate = r;
		totalSum = r * this.hours;
	}
	
	public Employee(String n, int r, int h) {
		this.name = n;
		this.rate = r;
		this.hours = h;
		totalSum = r * h;
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

	public float getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double getSalary() {
		totalSum += (rate * hours);
		return this.rate * this.hours;
	}
	public static double getTotalSalary() {
		return totalSum;
	}
	public void changeRate(int rate) {
//		totalSum -= this.rate;
		this.rate = rate;
		totalSum += rate;
	}
	public double getBonuses() {
		return (rate * hours * 0.1);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", Include bonuses=" + (getBonuses() + getSalary())
				+ "]";
	}
	
}
