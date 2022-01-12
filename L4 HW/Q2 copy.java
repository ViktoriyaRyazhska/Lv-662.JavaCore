package l4HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


enum Breed {
	CHIHUAHUA, POODLE, BEAGLE, BULLDOG, BOXER

} 

class Dog {
	private String name;
	private int age;
	private Breed breed;

	Dog() {}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public Breed getBreed() {
		return this.breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(String breed) {
		switch (breed) {
		case "Chihuahua": case "CHIHUAHUA": case "chihuahua":
			this.breed = Breed.CHIHUAHUA;
			break;
		case "Poodle": case "POODLE": case "poodle":
			this.breed = Breed.POODLE;
			break;
		case "Beagle": case "BEAGLE": case "beagle":
			this.breed = Breed.BEAGLE;
			break;
		case "Bulldog": case "BULLDOG": case "bulldog":
			this.breed = Breed.BULLDOG;
			break;
		case "Boxer": case "BOXER": case "boxer":
			this.breed = Breed.BOXER;
			break;
		default:
			System.out.println("Error breed not found");
		}
	}
}


public class Q2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter the first dog's name:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dog dog1 = new Dog();
		String name1 = br.readLine();
		dog1.setName(name1);
		System.out.println("Please enter the first dog's age as an integer:");
		int age1 = Integer.parseInt(br.readLine());
		dog1.setAge(age1);
		System.out.println("Please enter the first dog's breed:");
		dog1.setBreed(br.readLine());
		
		System.out.println("Please enter the second dog's name:");
		Dog dog2 = new Dog();
		String name2 = br.readLine();
		dog2.setName(name2);
		System.out.println("Please enter the second dog's age as an integer:");
		int age2 = Integer.parseInt(br.readLine());
		dog2.setAge(age2);
		System.out.println("Please enter the second dog's breed:");
		dog2.setBreed(br.readLine());
		
		System.out.println("Please enter the third dog's name:");
		Dog dog3 = new Dog();
		String name3 = br.readLine();
		dog3.setName(name3);
		System.out.println("Please enter the third dog's age as an integer:");
		int age3 = Integer.parseInt(br.readLine());
		dog3.setAge(age3);
		System.out.println("Please enter the third dog's breed:");
		dog3.setBreed(br.readLine()); 
		
		//I'm not sure why this code isn't working it gives me false even when the names are identical
		if ((dog1.getName().equals(dog2.getName())) ||
		    (dog1.getName().equals(dog3.getName())) ||
		    (dog3.getName().equals(dog2.getName())) ) {
			System.out.println("Error: some dogs have identical names");
		}
		
		
		String oldestName = dog3.getName();
		Breed oldestBreed = dog3.getBreed();
		
		if (dog1.getAge() > dog2.getAge()) {
			if (dog1.getAge() > dog3.getAge()) {
			oldestName = dog1.getName();
			oldestBreed = dog1.getBreed();
			}
		} else {
			if (dog2.getAge() > dog3.getAge()) {
			oldestName = dog2.getName();
			oldestBreed = dog2.getBreed();
			}
		}
		
		System.out.println(oldestName);
		System.out.println(oldestBreed);
		
		
        // I left this here so that I could test more later, it prints the dogs' info in order
		/*
		System.out.println(dog1.getName());
		System.out.println(dog1.getAge());
		System.out.println(dog1.getBreed());
		
		System.out.println(dog2.getName());
		System.out.println(dog2.getAge());
		System.out.println(dog2.getBreed());
		
		System.out.println(dog3.getName());
		System.out.println(dog3.getAge());
		System.out.println(dog3.getBreed());
		*/		
	}

}
