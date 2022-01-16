package HW5;

import java.util.Arrays;

public class BirdApp {
    public static void main(String[] args) {
        Bird arr[] = new Bird[4];

        FlyingBird b1 = new Eagle();
        b1.setMaxSpeed(120);
        arr[0] = b1;
        b1.fly();


        FlyingBird b2 = new Swallow();
        b2.setMaxSpeed(90);
        arr[1] = b2;
        b2.fly();

        NonFlyingBird b3 = new Penguin();
        b3.setBeak("Short");
        arr[2]  = b3;
        b3.fly();


        NonFlyingBird b4 = new Kiwi();
        b4.setBeak("Long");
        arr[3] = b4;
        b4.fly();

        System.out.println(Arrays.toString(arr));
    }
}
