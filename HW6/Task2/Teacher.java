package Task2;

public class Teacher extends Staff{
	
	int salary = 10300;

	@Override
	public void print() {
		System.out.print("I am a teacher. ");
	}
	
	@Override
	public void salary() {
		System.out.println("My salary is " + salary);
	}
	
	final String typePerson = "Staf";

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", typePerson=" + typePerson + "]";
	}

}
