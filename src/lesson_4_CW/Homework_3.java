package lesson_4_CW;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
        int[] integer = {1, 5, 3, -7, -4, 3, 0, -9, -12};

//        position of second positive number;
        int count = 0;
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of second positive number is " + i);
                break;
            }
        }
        //   minimum and its position in the array

        int minim = integer[0];
        int y = 0;
        while (y < integer.length) {
            if (integer[y] <minim) {
                minim = integer [y];
            }
            y++;
        }

        System.out.print("Minimum value = " + minim);

        for (int f = 0; f < integer.length; f++) {
            if (integer[f] == minim){
                System.out.println(" and it's position in the array is " + f);
            }
        }
//        Organize entering integers until the first negative number. Count the product of all entered even numbers
       int product = 1;
        for (int q = 0; q < integer.length; q++) {
            if (integer[q] > 0) {
                product = product * integer[q];
            } else {
                break;
            }
        }
        System.out.println(product);


    }
}
