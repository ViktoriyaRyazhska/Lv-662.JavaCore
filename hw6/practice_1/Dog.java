package hw6.practice_1;

public class Dog implements Animal {

	@Override
	public void voice() {

		System.out.println("Bark!");
	
	}

	@Override
	public void feed() {

		System.out.println("Dog is eating.");
	
	}

}