package lesson_3_HW;

public class Dog_main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Bon");
		d1.setAge(3);

		Dog d2 = new Dog();
		d2.setName("Rey");
		d2.setAge(2);

		Dog d3 = new Dog();
		d3.setName("Lola");
		d3.setAge(6);

		// Check if there is no two dogs with the same name.

		if (d1.getName() == d2.getName() | d2.getName() == d3.getName() | d1.getName() == d3.getName()) {
			System.out.println("There are dogs with the same name");

		} else {
			System.out.println("There are No dogs with the same name");
		}

		// Display the name and the kind of the oldest dog

	}
}
