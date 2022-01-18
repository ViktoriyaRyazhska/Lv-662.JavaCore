package hw6.practice_2;

public class Cleaner extends Staff {
	
	final static String TYPE_PERSON = "cleaner";
	
	public Cleaner(String name) {
		
		this.name = name;
		System.out.println(TYPE_PERSON);
		
	}

	@Override
	public void salary() {
	
		System.out.println("My salary is too low.");
		
	}

	@Override
	public void print() {

		System.out.println("I am a " + TYPE_PERSON + ".");
		
	}

}
