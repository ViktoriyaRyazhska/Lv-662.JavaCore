package lesson_7;

public class AnimalMain {

    public static void main(String[] args) {
        Animal[] animal = new Animal[4];
        animal[0] = new Cat("Liza", 3);
        animal[1] = new Cat("Luna", 1);
        animal[2] = new Dog("Ares", 7);
        animal[3] = new Dog("Mike", 4);


        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);
            animal[i].voice();
            animal[i].feed();
        }


    }

}

