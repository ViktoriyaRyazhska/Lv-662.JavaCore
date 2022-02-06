package HW4;

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Enter the number of month ");
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
            System.out.println("Month have 31 days");
        } else
        if(num== 4 || num == 6 || num == 9 || num == 11 ) {
            System.out.println("Month have 30 days");
        }else
            if(num == 2 ) {
                System.out.println("Month have 28-29 days");
            }else
                System.out.println("Are you kidding ?)");
    }
}
