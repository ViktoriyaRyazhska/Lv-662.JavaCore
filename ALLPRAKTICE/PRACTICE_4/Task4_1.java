package Task_4Praktice;

import java.util.Arrays;

public class Task4_1 {
    public static void main(String[] args) {

        // Create an array of ten integer . Display

        int tenInteger[] = {0, 1, -12, 7, 92, -142, 5, -25, 31, 48};
        System.out.println(Arrays.toString(tenInteger));

        // the biggest of these numbers

        int x = 0;
        for (int i = 0; i < tenInteger.length; i++) {
            if (x < tenInteger[i]) {
                x = tenInteger[i];
            }
        }
        System.out.println(" the biggest number is = " + x);

        //the sum of positive numbers in the array

        int y = 0;
        for (int i = 0; i < tenInteger.length; i++) {
            if (tenInteger[i] > 0) {
                y = y + tenInteger[i];
            }
        }
        System.out.println("the sum of positive numbers is = " + y);

        //the amount of negative numbers in the array

        int z = 0;
        for (int i = 0; i < tenInteger.length; i++) {
            if (tenInteger[i] < 0) {
                z += tenInteger[i];
            }
        }
        System.out.println("the sum of negative numbers is = " + z);

        //what values there are more : negative or positive

        if (z * -1 > y) System.out.println("negative numbers is bigger than positive");
        else System.out.println("positive numbers is bigger than negative");
    }
}
