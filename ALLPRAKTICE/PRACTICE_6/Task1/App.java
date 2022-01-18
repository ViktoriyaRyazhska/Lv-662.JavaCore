package Task_6Praktice.Task1;

public class App {


    public static void main(String[] args) {

        Animal[] arrOfAnimals = new Animal[4];
        arrOfAnimals[0] = new Dog();
        arrOfAnimals[1] = new Cat();
        arrOfAnimals[2] = new Dog();
        arrOfAnimals[3] = new Cat();

        for (int i = 0; i < arrOfAnimals.length;i++){
            System.out.println(arrOfAnimals[i].voice());
            System.out.println(arrOfAnimals[i].feed());
        }
    }
}