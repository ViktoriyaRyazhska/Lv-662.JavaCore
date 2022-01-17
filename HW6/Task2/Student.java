package Task2;

public class Student extends Person {

	@Override
	public void print() {
		System.out.println("I am a student.");
	}
	
	final String typePerson = "Student";

	@Override
	public String toString() {
		return "Student [typePerson=" + typePerson + "]";
	}
	
	

}
