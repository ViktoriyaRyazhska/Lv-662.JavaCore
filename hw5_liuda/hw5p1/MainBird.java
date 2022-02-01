package hw5p1;

import java.util.Arrays;

public class MainBird {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Penguin(false, true);
        birds[3] = new Chicken(false, true);


        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);

        }
        Arrays.toString(birds);
    }
}
