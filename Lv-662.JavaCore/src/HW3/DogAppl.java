package HW3;

//Сreate class Dog with fields name, breed, age. 

//Declare enum for field breed. 
//Create 3 instances of type Dog. 
//Check if there is no two dogs with the same name. 
//Display the name and the kind of the oldest dog. 

public class DogAppl {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Sonia", 8, Breed.French_Bulldog);
		Dog dog2 = new Dog("Tusik", 3, Breed.Labrador);
		Dog dog3 = new Dog("Musia", 10, Breed.Retriever);

		boolean checkOfTheName;

		checkOfTheName = dog1.equals(dog2) & dog2.equals(dog3) & dog3.equals(dog1); //масив 
		System.out.println("Are there any dogs with the same names:\t" + checkOfTheName); //найстарша 1 (алгоритм в циклах)

	}

}
