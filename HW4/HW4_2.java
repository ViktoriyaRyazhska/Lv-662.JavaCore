package HW4;

import java.util.Scanner;


public class HW4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        int product = 1;
        int m;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0){
               continue;
            }
            sum += n;
        }
        System.out.println(sum);
           for(int a = 0; a < 5; a++) {
               System.out.println("Input numbers");
               m = Integer.parseInt(sc.nextLine());
               if (m < 0){
                   continue;
               }
               product *= m;
           }
        System.out.println(product);

    }
}