package lesson_3_HW;

import lesson_3_HW.Dog.Breed;

public class Dog_main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Bon");
		d1.setAge(2);
		d1.setBreed(Breed.Akita);

		Dog d2 = new Dog();
		d2.setName("Rey");
		d2.setAge(2);
		d2.setBreed(Breed.Spaniel);

		Dog d3 = new Dog();
		d3.setName("Lola");
		d3.setAge(6);
		d3.setBreed(Breed.Terrier);

		// Check if there is no two dogs with the same name.

		if (d1.getName() == d2.getName() | d2.getName() == d3.getName() | d1.getName() == d3.getName()) {
			System.out.println("There are dogs with the same name");

		} else {
			System.out.println("There are No dogs with the same name");
		}

		// Display the name and the kind of the oldest dog

		if (d1.getAge() > d2.getAge() & d1.getAge() > d3.getAge()) {
			System.out.println("The name of the oldest dog is " + d1.getName() + " and breed is " + d1.breed);
		} else if (d2.getAge() > d1.getAge() & d2.getAge() > d3.getAge()) {
			System.out.println("The name of the oldest dog is " + d2.getName() + " and breed is " + d2.breed);
		} else if (d3.getAge() > d1.getAge() & d3.getAge() > d2.getAge()) {
			System.out.println("The name of the oldest dog is " + d3.getName() + " and breed is " + d3.breed);
		}

		}

	}

