package java21;

public class Employee {
	protected String name;
	protected int age;
	protected double salary;
	
	public Employee (String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String report() {
		return String.format("Имя: %s, возраст: %d, зарплата: \u20B4 %.2f", name, age, salary);
		
}
}