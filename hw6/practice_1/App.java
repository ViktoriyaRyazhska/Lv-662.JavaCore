package hw6.practice_1;

public class App {

	public static void main(String[] args) {

		Animal[] animals = new Animal[2];
		
		animals[0] = new Cat();
		animals[1] = new Dog();
		
		for (Animal animal : animals) {
			
			animal.voice();
			animal.feed();
		
		}
		
	}

}
