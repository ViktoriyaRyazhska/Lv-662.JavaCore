package lesson_3_HW;

public class Dog {
	private String name;
	private int age;
	Breed breed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name, int age, Breed type) {
		this.name = name;
		this.age = age;
		breed = type;
	}

	public Dog() {
	}

	public void setBreed(Breed breed) {
	this.breed = breed;

	}

	public enum Breed {
		Akita, Terrier, Spaniel
	}

}
