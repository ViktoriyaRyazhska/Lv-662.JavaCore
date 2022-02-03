package HW3;

public class Main {

    public static void main(String[] args) {
    Dog dog1 = new Dog("Cookie", Dog.Breed.Chau_chau,7);
    Dog dog2 = new Dog("Cookie", Dog.Breed.Bulldog,5);
    Dog dog3 = new Dog("Tyson", Dog.Breed.Labrador,12);
    if (dog1.name == dog2.name) {
            System.out.println("Dog " + dog1.name + " have the same name with dog " + dog2.name);
        }else
            if (dog2.name == dog3.name) {
            System.out.println("Dog" + dog2.name + "have the same name with dog" + dog3.name);
        } else {
            System.out.println("There are no dogs with same name");
        }
        if(dog1.age>dog2.age && dog1.age > dog2.age) {
            System.out.println(dog1.name + " Oldest dog ");
        }else
            if(dog2.age>dog3.age && dog2.age > dog3.age) {
                System.out.println(dog2.name + " Oldest dog ");
            }else {
                System.out.println(dog3.name + " Oldest dog");
        }
    }
}

