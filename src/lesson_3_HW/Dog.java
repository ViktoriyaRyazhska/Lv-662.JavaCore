package lesson_3_HW;

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
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
	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public Dog() {
		super();
	}

	public enum breed {
		Akita, Terrier, Spaniel
	}
	

	}
	

