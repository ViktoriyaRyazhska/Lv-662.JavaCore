package hw3;

public class DogApp {

	public static void main(String[] args) {

		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Sparky", 3, Breed.CHIHUAHUA);
		dogs[1] = new Dog("Costello", 10, Breed.BULLDOG);
		dogs[2] = new Dog("Tina", 6, Breed.DACHSHUND);
		
		if (dogs[0].getName() != dogs[1].getName() && dogs[1].getName() != dogs[2].getName() 
				&& dogs[0].getName() != dogs[2].getName()) {
			System.out.println("There is no two dogs with the same name.");
		} else {
			System.out.println("There is two or more dogs with the same name.");
		}
		
		Dog oldest = dogs[0];
		for (Dog dog : dogs) {
			if (dog.getAge() > oldest.getAge()) {
				oldest = dog;
			}
		}
		System.out.println(oldest.getName() + " is the oldest dog. " + oldest.getName() + 
				" is " + oldest.getBreed() + ".");
	}

}
