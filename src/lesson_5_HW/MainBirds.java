package lesson_5_HW;

public class MainBirds {
    public static void main(String[] args) {
        Bird [] birds = new Bird[4];
        birds[0] = new Chicken("enough", 10);
        birds[1] = new Eagle("many", 3);
        birds[2] = new Penguin("a little", 15);
        birds[3] = new Swallow("a lot", 20);

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
        }

        for (int i = 0; i < birds.length; i++) {
            int count = i+1;
           // System.out.println("The bird number " + count + " is " + birds[i].fly());
        }


    }

}
