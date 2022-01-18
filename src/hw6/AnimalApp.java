package hw6;

public class AnimalApp {
    public static void main(String[] args) {
        Animal [] animal = new Animal[2];

        animal[0] = new Cat();
        animal[1] = new Dog();

        for ( Animal i : animal) {
            System.out.print(i + " says: ");
            i.voice();
            System.out.print(i + " eats: ");
            i.feed();
        }
    }
}
