package l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Dog {
	
	public String name;
	public String breed;
	public int age;
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(name, other.name);
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the breed name: bearglier, bocker, bolognese");
		String breed = br.readLine();
		
		Dog d1 = new Dog();
		d1.setName("Jack");
		d1.setBreed("bearglier");
		d1.setAge(3);
		
		Dog d2 = new Dog();
		d2.setName("Johnie");
		d2.setBreed("bocker");
		d2.setAge(5);
		
		Dog d3 = new Dog();
		d3.setName("Bonnie");
		d3.setBreed("bolognese");
		d3.setAge(2);
		
		// Check if there is no two dogs with the same name. 
		
		enum Breed {
			BEARGLIER, BOCKER, BOLOGNESE
		}
		switch (breed.toLowerCase()) {
		case "bearglier":
		  System.out.println("The name of dog is " + d1.getName());
		break;
		case "bocker":
		  System.out.println("The name of dog is " + d2.getName());
		break;
		case "bolognese":
		  System.out.println("The name of dog is " + d3.getName());
		break;
		default:
		  System.out.println("There is no dog of this breed!");
		}
		
		System.out.println("If there are two or more dogs with the same name? " +  (d1.equals(d2) | d2.equals(d3) | d1.equals(d3)));
		
		// Display the name and the kind of the oldest dog. 
		
		if (d1.getAge() >= d2.getAge() & d1.getAge() >= d3.getAge()) {
			System.out.println("The oldest dog is " + d1.getBreed() + " " + d1.getName() + ". He is " + d1.getAge() + " years old.");
		}
		if (d2.getAge() >= d1.getAge() & d2.getAge() >= d3.getAge()) {
			System.out.println("The oldest dog is " + d2.getBreed() + " " + d2.getName() + ". He is " + d2.getAge() + " years old.");
		}
		if (d3.getAge() >= d1.getAge() & d3.getAge() >= d2.getAge()) {
			System.out.println("The oldest dog is " + d3.getBreed() + " " + d3.getName() + ". He is " + d3.getAge() + " years old.");
		}
	}

}
