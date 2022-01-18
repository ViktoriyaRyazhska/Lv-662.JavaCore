package hw6.practice_2;

public class Student extends Person {

	final static String TYPE_PERSON = "student";
	
	public Student(String name) {
		
		this.name = name;
		System.out.println(TYPE_PERSON);
		
	}

	@Override
	public void print() {

		System.out.println("I am a " + TYPE_PERSON + ".");
		
	}

}
