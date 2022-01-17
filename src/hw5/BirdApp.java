package hw5;

public class BirdApp {
    public static void main(String[] args) {
        Bird[] bird = new Bird[4];

        bird[0] = new Eagle("Wing", 3);
        bird[1] = new Swallow("Tail", 8);
        bird[2] = new Chicken("Down", 6);
        bird[3] = new Penguin("Tail", 5);

        for (Bird i : bird) {
            System.out.println(i);
            System.out.println("Can fly?: " + i.fly());
        }
    }
}
