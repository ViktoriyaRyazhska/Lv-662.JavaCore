package Task_5HM.Part1;

import java.util.Arrays;

public class AppBird {
    public static void main(String[] args) {

        Bird []birds = new Bird[4];
        birds[0] = new Eagle(true,true);
        birds[1] = new Swallow(true,true);
        birds[2] = new Chicken(true,true);
        birds[3] = new Penguin(true,true);
        System.out.println(Arrays.toString(birds));
    }
}
