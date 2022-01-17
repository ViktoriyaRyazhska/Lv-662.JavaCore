package PracticeFive;

public class AnimalApp {
    public static void main(String[] args) {

        Animal arr[] = new Animal[2];
        arr[0] = new Dog();
        arr[1] = new Cat();


        for (int i = 0; i < arr.length; i++) {
            arr[i].voice();
            arr[i].feed();

        }

    }
}
