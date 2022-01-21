package java21;

public class Developer extends Employee{
protected String position;

public Developer(String name, int age, String position, double salary) {
	super(name, age, salary);
	this.position=position;
}

	
	public void setPosition(String position) {
		this.position = position;
	}
		public String getPosition() {
			return position;
		}
	
@Override
	public String report() {
		return String.format("Имя: %s, возраст: %d, должность: %s зарплата: \u20B4 %.2f", name, age, position, salary);
	}
	
}
