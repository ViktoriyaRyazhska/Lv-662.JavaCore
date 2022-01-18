package hw6.practice_2;

public class Teacher extends Staff {
	
	final static String TYPE_PERSON = "teacher";
	
	public Teacher(String name) {
		
		this.name = name;
		System.out.println(TYPE_PERSON);
		
	}
	
	@Override
	public void salary() {
		
		System.out.println("I have a decent salary.");
		
	}

	@Override
	public void print() {
		
		System.out.println("I am a " + TYPE_PERSON + ".");
		
	}

}
