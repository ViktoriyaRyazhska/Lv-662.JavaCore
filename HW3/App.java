package java4;

public class App {
	public static void main(String[] args) {

        Dog FirstDog = new Dog("Martin", 2, Dog.Breed.Labrador);
        Dog SecondDog = new Dog("Ban", 5, Dog.Breed.Mastiff);
        Dog ThirdDog = new Dog("Lucky", 9, Dog.Breed.Doberman);
        if (FirstDog.Name == SecondDog.Name) {
            System.out.println("have the same name");
        } else if (SecondDog.Name == ThirdDog.Name) {
            System.out.println("have the same name ");
        } else {
            System.out.println("dont have a dog with those name ");
        }

        if (FirstDog.Age > SecondDog.Age && FirstDog.Age > ThirdDog.Age) {
            System.out.println(FirstDog.Name + " " + FirstDog.breed);
        } else if (SecondDog.Age > FirstDog.Age && SecondDog.Age > ThirdDog.Age) {
            System.out.println(SecondDog.Name + " " + SecondDog.breed);
        } else {
            System.out.println(ThirdDog.Name + " " + ThirdDog.breed);
        }
    }
}
