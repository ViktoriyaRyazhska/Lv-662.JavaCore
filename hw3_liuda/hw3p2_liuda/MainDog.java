package hw3p2_liuda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainDog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Dog dog1 = new Dog("ENGLISH_LABRADOR", 5);
        Dog dog2 = new Dog("AMERICAN_LABRADOR", 3);
        Dog dog3 = new Dog("ENGLISH_BULLDOG", 2);
        Dog dog4 = new Dog("FRENCH_BULLDOG", 7);
        Dog dog5 = new Dog("VICTORIAN_BULLDOG", 1);
        Dog dog6 = new Dog("MINIATURE_POODLE", 4);
        Dog dog7 = new Dog("TOY_POODLE", 8);

        dog1.input(br);
        dog2.input(br);
        dog3.input(br);
        dog4.input(br);
        dog5.input(br);
        dog6.input(br);
        dog7.input(br);

        System.out.println("Check if dog1 name = dog2 name");
        System.out.println(dog1.getName().equals(dog2.getName()));
        System.out.println("Check if dog2 name = dog3 name");
        System.out.println(dog2.getName().equals(dog3.getName()));
        System.out.println("Check if dog3 name = dog4 name");
        System.out.println(dog3.getName().equals(dog4.getName()));
        System.out.println("Check if dog4 name = dog5 name");
        System.out.println(dog4.getName().equals(dog5.getName()));
        System.out.println("Check if dog5 name = dog6 name");
        System.out.println(dog5.getName().equals(dog6.getName()));
        System.out.println("Check if dog6 name = dog7 name");
        System.out.println(dog6.getName().equals(dog7.getName())); // It looks like I have too many names (7) for using equals method



        int maxAge = Math.max((Math.max(Math.max(dog1.getAge(),dog2.getAge()), Math.max(dog3.getAge(), dog4.getAge()))), Math.max(Math.max(dog5.getAge(),dog6.getAge()), dog7.getAge()));
        System.out.println(maxAge); // Comparing 7 integers for finding max int, not sure this idea is good for completing the task


        if (maxAge == dog1.getAge()) {
            System.out.println("The oldest dog is " + dog1.getName() + " of " + Dog.Breed.LABRADOR + " breed");
        }
        else
            if (maxAge == dog2.getAge()){
                System.out.println("The oldest dog is " + dog2.getName() + " of " + Dog.Breed.LABRADOR + " breed");
            }
            else
                if (maxAge == dog3.getAge()){
                    System.out.println("The oldest dog is " + dog3.getName() + " of " + Dog.Breed.BULLDOG + " breed");
                }
                else
                    if (maxAge == dog4.getAge()) {
                        System.out.println("The oldest dog is " + dog4.getName() + " of " + Dog.Breed.BULLDOG + " breed");
                    }
                    else
                        if (maxAge == dog5.getAge()) {
                            System.out.println("The oldest dog is " + dog5.getName() + " of " + Dog.Breed.BULLDOG + " breed");
                        }
                        else
                            if (maxAge == dog6.getAge()) {
                                System.out.println("The oldest dog is " + dog6.getName() + " of " + Dog.Breed.PUDDLE + " breed");
                            }
                            else
                                if (maxAge == dog7.getAge()) {
                                    System.out.println("The oldest dog is " + dog7.getName() + " of " + Dog.Breed.PUDDLE + " breed");
                                }
    }
}
