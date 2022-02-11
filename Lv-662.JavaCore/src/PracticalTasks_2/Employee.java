package PracticalTasks_2;


public class Employee {
	private static float totalSum = 0;

	private String name;
	private int rate;
	private int hours;

	public Employee() {
	}

	public Employee(String name, int r) {
		this.name = name;
		this.rate = r;
	}

	public Employee(String n, int r, int h) {
		this.name = n;
		this.rate = r;
		this.hours = h;
		totalSum += this.getSalary();
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

	public void setRate(int r) {
		totalSum -= this.getSalary();
		this.rate = r;
		totalSum += this.getSalary();
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int h) {
		totalSum -= this.getSalary();
		this.hours = h;
		totalSum += this.getSalary();
	}

	public float getSalary() {
		return rate * hours;
	}

	public static double getTotalSum() {
		return totalSum;
	}

	public void changeRate(int r) {
		totalSum -= this.getSalary();
		this.rate = r;
		totalSum += this.getSalary();
	}

	public float getBonuses() {
		return (float) (getSalary() * 0.1);
	}
	
	public float getSalaryWithBonuses() {
		return getSalary() + getBonuses();
	}

	@Override
	public String toString() {
		return "Employee [name = " + name + ", rate = " + rate + ", hours = " + hours + ", Salary = " + getSalary()
				+ " $" + ", Include bonuses = " + (getBonuses() + getSalary()) + " $" + "]";
	}

}
