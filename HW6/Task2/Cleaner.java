package Task2;

public class Cleaner extends Staff{
	
	int salary = 8500;
	
	@Override
	public void print() {
		System.out.print("I am a cleaner. ");
	}

	@Override
	public void salary() {
		System.out.println("My salary is " + salary);
	}
	
	final String typePerson = "Staf";

	@Override
	public String toString() {
		return "Cleaner [salary=" + salary + ", typePerson=" + typePerson + "]";
	}
	
	

}
