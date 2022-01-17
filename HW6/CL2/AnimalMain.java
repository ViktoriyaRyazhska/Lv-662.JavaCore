package CL2;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[4];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Dog();
		
		for (int i = 0; i < animals.length; i++) {
		
		System.out.println(animals[i].getVoice());
		System.out.println(animals[i].getFeed());
		}

	}

}
