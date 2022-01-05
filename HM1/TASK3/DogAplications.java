package Task_3HM;

public class DogAplications {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex" ,7, Dog.Breed.Horgi);
        Dog dog2 = new Dog("Mars",3, Dog.Breed.Afador);
        Dog dog3 = new Dog("Archi",4, Dog.Breed.Komondor);

        if (dog1.Name == dog2.Name){
            System.out.println(" dog1 have the same name dog2 ");
        }else if(dog2.Name == dog3.Name){
            System.out.println(" dog2 have the same name dog3 ");
        }else{
            System.out.println(" there no dog with same name ");
        }

        if(dog1.Age>dog2.Age && dog1.Age>dog3.Age){
            System.out.println(dog1.Name + " " + dog1.breed);
        }else if(dog2.Age>dog1.Age && dog2.Age>dog3.Age) {
            System.out.println(dog2.Name + " " + dog2.breed);
        }else{
            System.out.println(dog3.Name + " " + dog3.breed);
        }
    }
}
