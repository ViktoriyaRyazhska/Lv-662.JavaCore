package hw3;

enum Breed {
	SHEPHERD,
	RETRIEVER,
	HUSKY,
	BULLDOG,
	POODLE,
	CHIHUAHUA,
	DOBERMANN,
	PUG,
	ROTTWEILER,
	DACHSHUND;
}

public class Dog {

	private String name;
	private int age;
	private Breed breed;
	
	public Dog(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

}

