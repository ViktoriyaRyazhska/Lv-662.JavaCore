package l6HWQ2;

public class Developer extends Employee {

	public Developer(String name, int age) {
		super(name, age, 32735.35);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String report() {
		return String.format("Name: %s, Age: %d years, Average Java Developer, Salary: \u20B4 %.2f.",
				this.name, this.age, 32735.35);
	}
	

}
