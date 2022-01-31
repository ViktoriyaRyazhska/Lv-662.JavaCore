package HW3;

//Сreate class Dog with fields name, breed, age. 

//Declare enum for field breed. 
//Create 3 instances of type Dog. 
//Check if there is no two dogs with the same name. 
//Display the name and the kind of the oldest dog. 

public class DogAppl {

	public static void main(String[] args) {

		Dog[] dogs = new Dog[2];

		dogs[0] = new Dog("Sonia", 8, Breed.French_Bulldog);

		dogs[1] = new Dog("Tusik", 3, Breed.Labrador);

		dogs[2] = new Dog("Musia", 10, Breed.Retriever);
		
//		for (int i = 0; i < dogs.length; i++) {
//			if (dogs[i].getName() != dogs[i - 1].getName()) {
//				System.out.println("There aren't two dogs with the same name");
//			} else {
//				System.out.println("There are two dogs with the same name");
//			}
//			
//		}
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}

//		boolean checkOfTheName;
//
//		checkOfTheName = dog1.equals(dog2) & dog2.equals(dog3) & dog3.equals(dog1); //масив 
//		System.out.println("Are there any dogs with the same names:\t" + checkOfTheName); //найстарша 1 (алгоритм в циклах)

	}

}
