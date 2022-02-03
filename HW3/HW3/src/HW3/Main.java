package HW3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write 3 float numbers ");
        Scanner scanner = new Scanner(System.in);
        double num_1 = scanner.nextDouble();
        double num_2 = scanner.nextDouble();
        double num_3 = scanner.nextDouble();
        if ((num_1 <= 5 && num_1 >= -5) && (num_2 <= 5 && num_2 >= -5) && (num_3 <= 5 && num_3 >= -5)) {
            System.out.println("Yes they are belong to [-5,5] ");
        } else {
            System.out.println("No they don't belong to [-5,5]");
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c)
            System.out.println(a+" is max num");
        else if (b > a && b > c)
            System.out.println(b+" is max num");
        else System.out.println(c+" is max num");
    }
}