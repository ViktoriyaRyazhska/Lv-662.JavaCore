package hw3p2_liuda;

import java.io.BufferedReader;
import java.io.IOException;


public class Dog {

        private final String name;
        Breed breed;
        private final int age;



        public enum Breed {
                LABRADOR, BULLDOG, PUDDLE

        }


        public Dog(String name, int age) {
                this.name = name;
                this.age = age;
        }


        public String getName() {
                return this.name;
        }

        public int getAge() {
                return this.age;
        }


        public void input(BufferedReader br) throws IOException {
                System.out.println("Write name of your dog");
                String nameDog = br.readLine();

                switch (nameDog.toUpperCase()) {
                        case "ENGLISH_LABRADOR":
                        case "AMERICAN_LABRADOR":
                                breed = Breed.LABRADOR;
                                System.out.println("Breed of this dog is " + breed);
                                break;
                        case "ENGLISH_BULLDOG":
                        case "FRENCH_BULLDOG":
                        case "VICTORIAN_BULLDOG":
                                breed = Breed.BULLDOG;
                                System.out.println("Breed of this dog is " + breed);
                                break;
                        case "MINIATURE_POODLE":
                        case "TOY_POODLE":
                                breed = Breed.PUDDLE;
                                System.out.println("Breed of this dog is " + breed);
                                break;
                        default:
                                System.out.println("It is not correct of name dog");


                }
        }


}
