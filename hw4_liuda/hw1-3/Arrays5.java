package hw4p1;

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {

       int[] arr5 = {2, 5, -4, 3, 4};
        System.out.print("Position of element 5 is : ");
        System.out.println(indexOf(arr5, 5)); //The method indexOf is written below


        int min = arr5[0];
        int imin = 0;
        int i = 0;
        while (i < arr5.length) {
            if (arr5[i] < min) {
                min = arr5[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Minimum = " + min);
        System.out.println(" and is in " + imin + " place");


        Scanner scan = new Scanner(System.in);
        int product1 = 1;
        for ( i = 0; i < arr5.length; i++) {
            System.out.println("Input indexes of array in order 0, 1, 2, .....");
            i = Integer.parseInt(scan.nextLine());
            if (arr5[i] % 2 == 0) {
                product1 = product1 * (arr5[i]);
            }

            if (arr5[i] > 0) {
                System.out.println("Value of this index is " + arr5[i]);
            }
           else if (arr5[i] < 0) {
              break;
              }
        }
        System.out.println("Value of this index is " + arr5[i] + " and it is negative");
        System.out.println("Product of entered even numbers is " + product1);
        scan.close();

    }

    private static int indexOf(int[] arr5, int search) {
        for (int i1 = 0; i1 < arr5.length; i1++) {
            if (arr5[i1] == search) {
                return i1;
            }
        }
        return -1;
    }


}
